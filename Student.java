import java.util.Scanner;

class Student {
    // Data members
    String studentName;
    int rollNumber;
    double marks;
    String courseName;
    int courseCredits;

    // Variables to store calculated values
    double totalFee;
    double scholarship;
    double finalFee;

    // Parameterized constructor
    Student(String studentName, int rollNumber, double marks,
            String courseName, int courseCredits) {

        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    // Calculate course fee
    double calculateFee() {
        totalFee = courseCredits * 1500;
        return totalFee;
    }

    // Check eligibility
    boolean checkEligibility() {
        return marks >= 50;
    }

    // Calculate scholarship
    double calculateScholarship() {
        if (marks >= 85) {
            scholarship = totalFee * 0.20;
        } 
        else if (marks >= 70) {
            scholarship = totalFee * 0.10;
        } 
        else {
            scholarship = 0;
        }

        return scholarship;
    }

    // Calculate final fee
    double calculateFinalFee() {
        finalFee = totalFee - scholarship;
        return finalFee;
    }

    // Display all details
    void displayDetails() {
        System.out.println("\n----- Student Course Registration Details -----");

        System.out.println("Student Name  : " + studentName);
        System.out.println("Roll Number   : " + rollNumber);
        System.out.println("Marks         : " + marks);
        System.out.println("Course Name   : " + courseName);
```}
    }
