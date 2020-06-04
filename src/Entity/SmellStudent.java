/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author os_conght
 */
public class SmellStudent {

    private String name;
    private int age;
    private String student_type;
    private static int STANDARD_FEE = 10;

    public double payTuitionFee() {
        if (this.getStudent_type().equals("foreign")) {
            return STANDARD_FEE * 1.3;
        } else if (this.getStudent_type().equals("talented")) {
            return STANDARD_FEE * 0.8;
        } else {
            return STANDARD_FEE;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudent_type() {
        return student_type;
    }

    public void setStudent_type(String student_type) {
        this.student_type = student_type;
    }

}
