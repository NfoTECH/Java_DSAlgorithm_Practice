package streams;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
//        System.out.println(example2(List.of(1,2,6,9,8,3,4,5,1,2,3,46,7,8,9,10)));
//        System.out.println(example3(List.of("a","b","a","a")));
//        System.out.println(example4(List.of(1,2,3), List.of(4,5,6)));
        System.out.println(example5(List.of(new User("ebi", "abj", 23),
                new User("busola", "lag", 25),
                new User("kehinde", "lag", 30)), "lag"));
    }
    public static int example1(List<Integer> nums){
        return nums.stream().mapToInt(num -> num).sum();
    }
    public static List<Integer> example2(List<Integer> nums){
        return nums.stream().sorted().collect(Collectors.toList());
    }
    public static String example3(List<String> strs){
        return strs.stream().map(String::toUpperCase)
                .filter(s -> s.equalsIgnoreCase("A"))
                .findAny().map(String::toLowerCase).get();
    }
    public static List<Integer> example4(List<Integer> nums1, List<Integer> nums2){
//        List<Integer> res = new ArrayList<>();
//        for (int i = 0; i < nums1.size(); i++){
//          int sum = nums1.get(i) + nums2.get(i);
//          res.add(sum);
//        }
//        return res;
        return nums1.stream().map(n -> n + nums2.get(nums1.indexOf(n))).collect(Collectors.toList());
    }
    public static List<UserDTO> example5(List<User> users, String address){
        Function<User, UserDTO> mapToDTO = user -> new UserDTO(user.getName(), user.getAddress(), user.getAge());
        UnaryOperator<UserDTO> anotherMap = userDTO -> {
            userDTO.setRetrieved(true);
            return userDTO;
        };
        BiFunction<User, String, UserDTO> bimapFunc = (user, addr) -> new UserDTO(user.getName(), addr, user.getAge());
        return users.stream()
                .filter(user -> user.getAddress().equalsIgnoreCase(address))
                .map(user -> bimapFunc.apply(user, "rivers state"))
                .collect(Collectors.toList());
//                .map(mapToDTO)
//                .map(anotherMap)
    }
}
class User{
    private String name;
    private String address;
    private int age;
    private boolean retrieved;
    public User(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isRetrieved() {
        return retrieved;
    }
    public void setRetrieved(boolean retrieved) {
        this.retrieved = retrieved;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", retrieved=" + retrieved +
                '}';
    }
}
class UserDTO{
    private String name;
    private String address;
    private int age;
    private boolean retrieved;
    public UserDTO(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isRetrieved() {
        return retrieved;
    }
    public void setRetrieved(boolean retrieved) {
        this.retrieved = retrieved;
    }
    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", retrieved=" + retrieved +
                '}';
    }
}