package assessmentDay;
//
//You are in charge of designing a system to install packages on computer systems.
//
//        Be are required to support the installation of a package and all of its dependent packages.
//
//        You have a package repository in which there are dependencies between packages for building like package: [A depends on 8] A has to be built before package B.
//        If you are given dependencies between the packages and package name X, we have find the build order for X. 10 Here is an example of a package structure that we would need to install:
//
//        A depends on, C
//
//        depends on 0, E, F C depends on 15 F depends on G
//        Define what a package looks like and code a solution to this problem

import java.util.ArrayList;
import java.util.List;

public class Amazon2 {
    public class Package {
        String name;
        List<Package> dependencies;
    }

    public List<Package> buildOrder(Package p) {
        List<Package> result = new ArrayList<>();
        if (p == null) {
            return result;
        }
        if (p.dependencies == null || p.dependencies.size() == 0) {
            result.add(p);
            return result;
        }
        for (Package dependency : p.dependencies) {
            result.addAll(buildOrder(dependency));
        }
        result.add(p);
        return result;
    }

    public static void main(String[] args) {
        Amazon2 a = new Amazon2();
        Amazon2.Package p = a.new Package();
        p.name = "A";
        Amazon2.Package p1 = a.new Package();
        p1.name = "B";
        Amazon2.Package p2 = a.new Package();
        p2.name = "C";
        Amazon2.Package p3 = a.new Package();
        p3.name = "D";
        Amazon2.Package p4 = a.new Package();
        p4.name = "E";
        Amazon2.Package p5 = a.new Package();
        p5.name = "F";
        Amazon2.Package p6 = a.new Package();
        p6.name = "G";
        p.dependencies = new ArrayList<>();
        p.dependencies.add(p2);
        p.dependencies.add(p3);
        p.dependencies.add(p4);
        p2.dependencies = new ArrayList<>();
        p2.dependencies.add(p5);
        p5.dependencies = new ArrayList<>();
        p5.dependencies.add(p6);
        List<Package> result = a.buildOrder(p);
        for (Package package1 : result) {
            System.out.println(package1.name);
        }
    }
}
