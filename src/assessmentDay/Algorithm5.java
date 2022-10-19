package assessmentDay;//You have a time machine and have traveled to 1st January 1900.
//
//        You have a list of events given as an array of strings, as follows:
//
//<event title> <date>, <event title> <date>, <event title> <date>
//
//White spaces separate the event from the date in dd-mm-yyyy format.
//
//        You want to visit some events in other years, but to set your time machine correctly, you need to submit the events in a different format:
//
//        You need a code that will sort your list of events from earliest to latest in the following format
//
//<years to event>years; months to event>months;<days
//
//to event-days-cevent titles
//
//        Note that there are no white spaces here.
//
//        If the date format is incorrect, the function should not include the string in the output array
//
//        The code has one or more bugs, it is your task to find the bugs and
//
//        resolve the issues
//
//        Examples:
//
//        Input [The first human in space 12-03-1941) Output [61years: 2months:11days-The first hin space]
//
//        St (EventC 01-81-1983, Event A 84-81-2900, Event #



public class Algorithm5 {
    public static String[] sorted(String[] strArr) {
        // code goes here
        String[] result = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String[] arr = strArr[i].split(" ");
            String str = arr[1];
            String[] arr2 = str.split("-");
            int date = Integer.parseInt(arr2[0]);
            int month = Integer.parseInt(arr2[1]);
            int year = Integer.parseInt(arr2[2]);
            if (year > 1900) {
                int year2 = year - 1900;
                int month2 = 12 - month;
                int date2 = 31 - date;
                result[i] = year2 + "years: " + month2 + "months: " + date2 + "days-" + arr[0];
            }
        }
        return result;
    }
}
