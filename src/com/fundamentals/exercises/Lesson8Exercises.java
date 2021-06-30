package com.fundamentals.exercises;

public class Lesson8Exercises {
    /*
    * Write a method
    *
    *
    *
    *
    * */

    public static void main(String[] args) {
        gradeInfov2('A');
    }
    public String gradeInfo(char grade) {
        String description;
        switch (grade){
            case  'E':
                description = "Excellenat";
                break;
            case 'V':
                description = "Very Good";
                break;
            case 'G':
                description = "Good";
                break;
            case 'A':
                description = "Average";
                break;
            case 'F':
                description = "Failed";
                break;
            default:
                description = "Not a valid grade";
        }
    return description;
    }

    public static String gradeInfov2(char grade) {
        String description;
        switch (grade){
            case  'E':return  "Excellenat";
            case 'V': return "Very Good";
            case 'G': return "Good";
            case 'A': return "Average";
            case 'F': return "Failed";
            default:  return "Not a valid grade";
        }
    }

    /* Write a method that will take no parameters or
     return type. Using a loop, display all the numbers
      divisible by 3 from 0 to 30. Utilize a modulus to
      obtain your results.
      */

}
