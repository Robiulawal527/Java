import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Student> studentsList = new ArrayList<>();
    public static ArrayList<Faculty> facultiesList = new ArrayList<>();
    public static ArrayList<Course> coursesList = new ArrayList<>();

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {

            System.out.println("*************************University Management System**********************************");
            System.out.println();
            System.out.println("1. Add  a (student / faculty / course / student to a course / faculty to a course.)");
            System.out.println("2. Delete a (student / faculty / course / student from a course / faculty from a course.)");
            System.out.println("3. Update a (student / faculty / course / student to a course / faculty to a course.)");
            System.out.println("4. Print ");
            System.out.println("5. Search");
            System.out.println("0. Exit");

            System.out.println();
           
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();

            if (choice == 0) {
            break;
            }

            switch (choice) {
            case 1:
                System.out.println();
                System.out.println("""
                    a. Add a student
                    b. Add a faculty
                    c. Add a course
                    d. Add a student to a course
                    e. Add a faculty to a course
                    x. Return to main menu""");

                System.out.print("Enter any option: ");
                char choice1 = input.next().charAt(0);

                if (choice1 == 'x') {
                continue;

                } else if (choice1 == 'a') {
                System.out.println("ID: ");
                int id = input.nextInt();
                input.nextLine();

                System.out.println("Name: ");
                String name = input.nextLine();


                System.out.println("CGPA: ");
                double cg = input.nextDouble();

                Student s = new Student(id, name, cg);
                addAStudent(s, s.getStudentId());

                } else if (choice1 == 'b') {
                System.out.println("ID: ");
                int id = input.nextInt();
                input.nextLine();

                System.out.println("Name: ");
                String name = input.nextLine();

                System.out.println("Position: ");
                String position = input.next();

                Faculty f = new Faculty(id, name, position);
                addAFaculty(f, f.getFacultyId());

                } else if (choice1 == 'c') {
                System.out.println("Course code: ");
                String code = input.next();
                input.nextLine();

                System.out.println("Course title: ");
                String name = input.nextLine();

                System.out.println("Credit: ");
                double cred = input.nextDouble();

                Course c = new Course(code, name, cred);
                addACourse(c, c.getCourseCode());

                } else if (choice1 == 'd') {
                System.out.println("Course code: ");
                String courseCode = input.next();
                input.nextLine();

                System.out.println("Student ID: ");
                int sid = input.nextInt();

                addAStudentToACourse(courseCode, sid);

                } else if (choice1 == 'e') {
                System.out.println("Course code: ");
                String courseCode = input.next();
                input.nextLine();

                System.out.println("Faculty ID: ");
                int fid = input.nextInt();

                addAFacultyToACourse(courseCode, fid);
                } else {
                System.out.println("\nEnter valid input");
                }
                break;

            case 2:
                System.out.println();
                System.out.println("""
                    a. Delete a student
                    b. Delete a faculty
                    c. Delete a course
                    d. Delete a student to a course
                    e. Delete a faculty to a course
                    x. Return to main menu""");

                System.out.print("Enter any option: ");
                char choice2 = input.next().charAt(0);

                if (choice2 == 'x') {
                continue;

                } else if (choice2 == 'a') {
                System.out.println("Enter student id that you want to delete: ");
                int sid = input.nextInt();
                deleteAStudent(sid);

                } else if (choice2 == 'b') {
                System.out.println("Enter course code that you want to delete: ");
                String courseCode = input.next();
                deleteACourse(courseCode);

                } else if (choice2 == 'c') {
                System.out.println("Enter faculty id that you want to delete: ");
                int fId = input.nextInt();
                deleteAFaculty(fId);

                } else if (choice2 == 'd') {
                System.out.println("Enter course code to delete student from course: ");
                String cCode = input.next();
                System.out.println("Enter student id to delete student from course: ");
                int sID = input.nextInt();
                deleteAStudentFromCourse(cCode, sID);

                } else if (choice2 == 'e') {
                System.out.println("Enter course code to remove a faculty: ");
                String cCode = input.next();
                deleteAFacultyFromCourse(cCode);
                } else {
                System.out.println("\nEnter valid input");
                }
                break;

            case 3:
                System.out.println();
                System.out.println("""
                    a. Update a student
                    b. Update a faculty
                    c. Update a course
                    d. Update a student to a course
                    e. Update a faculty to a course
                    x. Return to main menu""");

                System.out.print("Enter any option: ");
                char choice3 = input.next().charAt(0);

                if (choice3 == 'x') {
                continue;

                } else if (choice3 == 'a') {
                System.out.println("Enter student id to update info: ");
                int sId = input.nextInt();
                updateAStudent(sId);

                } else if (choice3 == 'b') {
                System.out.println("Enter faculty id to update info: ");
                int fId = input.nextInt();
                updateAFaculty(fId);

                } else if (choice3 == 'c') {
                System.out.println("Enter course code to update info: ");
                String cCode = input.next();
                updateACourse(cCode);

                } else if (choice3 == 'd') {
                System.out.println("Enter course code to update a student from a course: ");
                String cCode = input.next();

                System.out.println("Enter student id to update a student from a course: ");
                int sId = input.nextInt();
                updateAStudentToACourse(cCode, sId);

                } else if (choice3 == 'e') {
                System.out.println("Enter course code to update a faculty to a course: ");
                String cCode = input.next();
                updateAFacultyToACourse(cCode);

                } else {
                System.out.println("\nEnter valid input");
                }
                break;

            case 4:
                    System.out.println();
                    System.out.println("""
                        a. Print all students
                        b. Print all courses
                        c. Print all faculties
                        d. Print information of a student
                        e. Print information of a course
                        f. Print information of a faculty
                        g. Print student list and faculty information of a course
                        h. Print courses taken by a student
                        x. Return to main menu""");

                    System.out.print("Enter any option: ");
                    char choice4 = input.next().charAt(0);

                    switch (choice4) {
                        case 'x':
                            continue;

                        case 'a':
                            printAllStudent();
                            break;

                        case 'b':
                            printAllCourse();
                            break;

                        case 'c':
                            printAllFaculty();
                            break;

                        case 'd':
                            System.out.print("Enter student id to see her/him information: ");
                            int stuId = input.nextInt();
                            printInfoOfAStudent(stuId);
                            break;

                        case 'e':
                            System.out.print("Enter course code to see its information: ");
                            String courseCode = input.next();
                            printInfoOfACourse(courseCode);
                            break;

                        case 'f':
                            System.out.print("Enter faculty id to see her/him information: ");
                            int fId = input.nextInt();
                            printInfoOfAFaculty(fId);
                            break;

                        case 'g':
                            printStudentListAndFacultyInfo();
                            break;

                        case 'h':
                            System.out.println("Enter student id to see her/him courses: ");
                            int sid = input.nextInt();
                            printCourseTakenByStudent(sid);
                            break;

                        default:
                            System.out.println("\nEnter valid input");
                            break;
                    }
                    break;

            case 5:
                System.out.println();
                System.out.println("""
                    a. Search a students
                    b. Search a course
                    c. Search a faculty
                    d. Search whether a student takes a course
                    e. Search whether a faculty teaches a course
                    f. Search courses taken by a student
                    g. Search course taught by a faculty
                    x. Return to main menu""");

                System.out.print("Enter any option: ");
                char choice5 = input.next().charAt(0);

                if (choice5 == 'x') {
                continue;

                } else if (choice5 == 'a') {
                System.out.println("Enter student id to search: ");
                int sId = input.nextInt();
                Student ans = searchStudent(sId);
                if (ans != null) {
                    System.out.println("Student id: " + ans.getStudentId());
                    System.out.println("Student name: " + ans.getStudentName());
                    System.out.println("Student cgpa: " + ans.getStudentCgpa());
                    System.out.println();
                } else {
                    System.out.println("Student not found");
                }

                } else if (choice5 == 'b') {
                System.out.println("Enter course code to search: ");
                String cCode = input.next();
                Course ans = searchCourse(cCode);
                if (ans != null) {
                    System.out.println("Course code: " + ans.getCourseCode());
                    System.out.println("Course title: " + ans.getCourseTitle());
                    System.out.println("Course credit: " + ans.getCourseCredit());
                    System.out.println();
                } else {
                    System.out.println("Course not found");
                }

                } else if (choice5 == 'c') {
                System.out.println("Enter faculty id to search: ");
                int fId = input.nextInt();
                Faculty ans = searchFaculty(fId);
                if (ans != null) {
                    System.out.println("Faculty id: " + ans.getFacultyId());
                    System.out.println("Faculty name: " + ans.getFacultyName());
                    System.out.println("Faculty position: " + ans.getFacultyPosition());
                    System.out.println();
                } else {
                    System.out.println("Faculty not found");
                }

                } else if (choice5 == 'd') {
                System.out.println("Enter student id to search whether a student takes a course: ");
                int sId = input.nextInt();

                System.out.println("Enter course code to search whether a student takes a course: ");
                String cCode = input.next();

                boolean ans = whetherAStudentTakeACourse(sId, cCode);

                if (ans) {
                    System.out.println("Yes student take this course");
                } else {
                    System.out.println("No student found");
                }

                } else if (choice5 == 'e') {
                System.out.println("Enter faculty id to search whether a student takes a course: ");
                int fId = input.nextInt();

                System.out.println("Enter course code to search whether a student takes a course: ");
                String cCode = input.next();

                boolean ans = whetherAFacultyTeachesACourse(fId, cCode);

                if (ans) {
                    System.out.println("Yes faculty take this course");
                } else {
                    System.out.println("No faculty found");
                }

                } else if (choice5 == 'f') {
                System.out.println("Enter student id to search courses taken by a student: ");
                int sId = input.nextInt();
                ArrayList<Course> ans = searchCoursesTakenByStudent(sId);
                if (!ans.isEmpty()) {
                    System.out.println("These courses are taken by student: ");
                    for (Course i : ans) {
                    System.out.println("Course code: " + i.getCourseCode());
                    System.out.println("Course title: " + i.getCourseTitle());
                    System.out.println("Course credit: " + i.getCourseCredit());
                    System.out.println();
                    }
                } else {
                    System.out.println("No course found");
                }

                } else if (choice5 == 'g') {
                System.out.println("Enter faculty id to search course taught by a faculty: ");
                int fId = input.nextInt();
                ArrayList<Course> ans = searchCoursesTaughtByFaculty(fId);
                if (!ans.isEmpty()) {
                    System.out.println("These course are taught by faculty: ");
                    for (Course j : ans) {
                    System.out.println("Course code: " + j.getCourseCode());
                    System.out.println("Course title: " + j.getCourseTitle());
                    System.out.println("Course credit: " + j.getCourseCredit());
                    System.out.println();
                    }
                } else {
                    System.out.println("No faculty found");
                }
                } else {
                System.out.println("\nEnter valid input");
                }
                break;

            default:
                System.out.println("Enter valid input");
                break;
            }
        }
        } // End of public static void main

    //---------------------------------------------------*****----------------------------------------------------------
    // add new student
    public static void addAStudent(Student s, int sId) {
        boolean flag = true;
        for (Student e : studentsList) {
            if (e.equals(s) || e.getStudentId() == sId) {
                flag = false;
                break;
            }
        }
        if (flag) {
            studentsList.add(s);
            System.out.println("Student added!");
        } else {
            System.out.println("Already exists! or student ID can not be same");
        }
    }

    // add new faculty
    public static void addAFaculty(Faculty f, int fID) {
        boolean flag = true;
        for (Faculty f1 : facultiesList) {
            if (f1.equals(f) || f1.getFacultyId() == fID) {
                flag = false;
                break;
            }
        }
        if (flag) {
            facultiesList.add(f);
            System.out.println("Faculty added");
        } else {
            System.out.println("Already exist or faculty ID can not be same");
        }
    }

    // add new course
    public static void addACourse(Course c, String cCode) {
        boolean flag = true;
        for (Course c1 : coursesList) {
            if (c1.equals(c) || c1.getCourseCode().equals(cCode)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            coursesList.add(c);
            System.out.println("Course added");
        } else {
            System.out.println("Already exist or course Code can not be same");
        }
    }

    // add a student to a course
    public static void addAStudentToACourse(String courseCode, int sid) {
        int courseIndex = -1, studentIndex = -1;
        for (int i = 0; i < coursesList.size(); i++) {
            if (courseCode.equals(coursesList.get(i).getCourseCode())) {
                courseIndex = i;
                break;
            }
        }
        for (int i = 0; i < studentsList.size(); i++) {
            if (sid == studentsList.get(i).getStudentId()) {
                studentIndex = i;
                break;
            }
        }
        if (studentIndex != -1 && courseIndex != -1) {
            coursesList.get(courseIndex).addStudent(studentsList.get(studentIndex));
            System.out.println("Successfully add student to a course");
        } else {
            System.out.println("Course or student not found");
        }
    }

    // add a faculty to a course
    public static void addAFacultyToACourse(String courseCode, int facultyID) {
        int courseIndex = -1, facultyIndex = -1;
        for (int i = 0; i < coursesList.size(); i++) {
            if (courseCode.equals(coursesList.get(i).getCourseCode())) {
                courseIndex = i;
                break;
            }
        }
        for (int i = 0; i < facultiesList.size(); i++) {
            if (facultyID == facultiesList.get(i).getFacultyId()) {
                facultyIndex = i;
                break;
            }
        }
        if (courseIndex != -1 && facultyIndex != -1) {
            coursesList.get(courseIndex).addFaculty(facultiesList.get(facultyIndex));
        } else {
            System.out.println("Course or faculty not found");
        }
    }

    //---------------------------------------------------*****----------------------------------------------------------
    // delete a student
    public static void deleteAStudent(int sId) {
        int studentIndex = -1;
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getStudentId() == sId) {
                studentIndex = i;
                break;
            }
        }
        if (studentIndex != -1) {
            studentsList.remove(studentIndex);
            System.out.println("Successfully remove a student");
        } else {
            System.out.println("Student not found");
        }
    }

    // delete a course
    public static void deleteACourse(String cCode) {
        int courseIndex = -1;
        for (int i = 0; i < coursesList.size(); i++) {
            if (coursesList.get(i).getCourseCode().equals(cCode)) {
                courseIndex = i;
            }
        }
        if (courseIndex != -1) {
            coursesList.remove(courseIndex);
            System.out.println("Successfully remove a course");
        } else {
            System.out.println("Course not found");
        }
    }

    // delete a faculty
    public static void deleteAFaculty(int fId) {
        int facultyIndex = -1;
        for (int i = 0; i < facultiesList.size(); i++) {
            if (facultiesList.get(i).getFacultyId() == fId) {
                facultyIndex = i;
                break;
            }
        }
        if (facultyIndex != -1) {
            facultiesList.remove(facultyIndex);
            System.out.println("Successfully remove a faculty");
        } else {
            System.out.println("Faculty not found");
        }
    }

    // delete a student from a course
    public static void deleteAStudentFromCourse(String courseCode, int studentId) {
        int courseIndex = -1;
        for (int i = 0; i < coursesList.size(); i++) {
            if (coursesList.get(i).getCourseCode().equals(courseCode)) {
                courseIndex = i;
                break;
            }
        }
        if (courseIndex != -1) {
            Course c = coursesList.get(courseIndex);
            ArrayList<Student> studentList = c.getStudentList();
            int studentIndex = -1;
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getStudentId() == studentId) {
                    studentIndex = i;
                    break;
                }
            }
            if (studentIndex != -1) {
                studentList.remove(studentIndex);
                c.setNumberOfStudents(studentList.size());
                System.out.println("Successfully student removed from the course");
            } else {
                System.out.println("Student not enrolled in the course ");
            }
        } else {
            System.out.println("Course not found!");
        }
    }

    // delete a faculty from a course
    public static void deleteAFacultyFromCourse(String courseCode) {
        int courseIndex = -1;
        for (int i = 0; i < coursesList.size(); i++) {
            if (coursesList.get(i).getCourseCode().equals(courseCode)) {
                courseIndex = i;
                break;
            }
        }
        if (courseIndex != -1) {
            Course c = coursesList.get(courseIndex);
            Faculty faculty = c.getFaculty();
            if (faculty != null) {
                c.dropFaculty();
                System.out.println("Successfully faculty removed from the course");
            } else {
                System.out.println("No faculty found in the course ");
            }
        } else {
            System.out.println("Course not found!");
        }
    }

    //---------------------------------------------------*****----------------------------------------------------------
    // update a student
    public static void updateAStudent(int sID) {
        int studentIndex = -1;
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getStudentId() == sID) {
                studentIndex = i;
                break;
            }
        }
        if (studentIndex != -1) {
            Student newStudent = studentsList.get(studentIndex);

            System.out.println("Enter student new id: ");
            int newStuId = input.nextInt();
            newStudent.setStudentId(newStuId);

            System.out.println("Enter student new name: ");
            String newStuName = input.next();
            newStudent.setStudentName(newStuName);

            System.out.println("Enter student new cgpa: ");
            double newStuCgpa = input.nextDouble();
            newStudent.setStudentCgpa(newStuCgpa);

            System.out.println("Student info updated");

        } else {
            System.out.println("Student not found");
        }
    }

    // update a course
    public static void updateACourse(String cCode) {
        int courseIndex = -1;
        for (int i = 0; i < coursesList.size(); i++) {
            if (coursesList.get(i).getCourseCode().equals(cCode)) {
                courseIndex = i;
                break;
            }
        }
        if (courseIndex != -1) {
            Course newCourse = coursesList.get(courseIndex);

            System.out.println("Enter course new code: ");
            String newCCode = input.next();
            newCourse.setCourseCode(newCCode);

            System.out.println("Enter course new title: ");
            String newCTitle = input.next();
            newCourse.setCourseTitle(newCTitle);

            System.out.println("Enter course new credit: ");
            double newCCredit = input.nextDouble();
            newCourse.setCourseCredit(newCCredit);

            System.out.println("Course info updated");

        } else {
            System.out.println("Course not found");
        }
    }

    // update a faculty
    public static void updateAFaculty(int fId) {
        int courseIndex = -1;
        for (int i = 0; i < facultiesList.size(); i++) {
            if (facultiesList.get(i).getFacultyId() == fId) {
                courseIndex = i;
                break;
            }
        }
        if (courseIndex != -1) {
            Faculty newFaculty = facultiesList.get(courseIndex);

            System.out.print("Enter faculty new id: ");
            int newFid = input.nextInt();
            newFaculty.setFacultyId(newFid);

            System.out.println("Enter faulty new name: ");
            String newFName = input.next();
            newFaculty.setFacultyName(newFName);

            System.out.print("Enter faculty new position: ");
            String newFPosition = input.next();
            newFaculty.setFacultyPosition(newFPosition);

            System.out.println("Faculty info updated");

        } else {
            System.out.println("Faculty not found");
        }
    }

    // update a student to a course
    public static void updateAStudentToACourse(String cCode, int sId) {
        int courseIndex = -1;
        for (int i = 0; i < coursesList.size(); i++) {
            if (coursesList.get(i).getCourseCode().equals(cCode)) {
                courseIndex = i;
                break;
            }
        }
        if (courseIndex != -1) {
            Course c = coursesList.get(courseIndex);
            ArrayList<Student> newStuList = c.getStudentList();

            int studentIndex = -1;
            for (int i = 0; i < newStuList.size(); i++) {
                if (newStuList.get(i).getStudentId() == sId) {
                    studentIndex = i;
                    break;
                }
            }
            if (studentIndex != -1) {
                Student newStudent = newStuList.get(studentIndex);

                System.out.println("Enter student new id: ");
                int newStuId = input.nextInt();
                newStudent.setStudentId(newStuId);

                System.out.println("Enter student new name: ");
                String newStuName = input.next();
                newStudent.setStudentName(newStuName);

                System.out.println("Enter student new cgpa: ");
                double newStuCgpa = input.nextDouble();
                newStudent.setStudentCgpa(newStuCgpa);

                System.out.println("Student info updated in a course");
            } else {
                System.out.println("Student not enrolled in the course ");
            }
        } else {
            System.out.println("Course not found!");
        }
    }

    // update a faculty to a course
    public static void updateAFacultyToACourse(String cCode) {
        int courseIndex = -1;
        for (int i = 0; i < coursesList.size(); i++) {
            if (coursesList.get(i).getCourseCode().equals(cCode)) {
                courseIndex = i;
                break;
            }
        }
        if (courseIndex != -1) {
            Course c = coursesList.get(courseIndex);
            Faculty newFaculty = c.getFaculty();
            if (newFaculty != null) {

                System.out.print("Enter faculty new id: ");
                int newFid = input.nextInt();
                newFaculty.setFacultyId(newFid);

                System.out.println("Enter faulty new name: ");
                String newFName = input.next();
                newFaculty.setFacultyName(newFName);

                System.out.print("Enter faculty new position: ");
                String newFPosition = input.next();
                newFaculty.setFacultyPosition(newFPosition);

                System.out.println("Faculty info updated");
            } else {
                System.out.println("No faculty is found");
            }
        } else {
            System.out.println("Course not found!");
        }
    }

    //---------------------------------------------------*****----------------------------------------------------------
    // print all student
    public static void printAllStudent() {
        for (Student s : studentsList) {
            System.out.println(s.toString());
        }
    }

    // print all course
    public static void printAllCourse() {
        for (Course c : coursesList) {
            System.out.println("Course code: " + c.getCourseCode());
            System.out.println("Course title: " + c.getCourseTitle());
            System.out.println("Course credit: " + c.getCourseCredit());
            System.out.println();
        }
    }

    // print all faculty
    public static void printAllFaculty() {
        for (Faculty f : facultiesList) {
            System.out.println(f.toString());
        }
    }

    // print information of a student
    public static void printInfoOfAStudent(int sID) {
        for (Student s : studentsList) {
            if (s.getStudentId() == sID) {
                System.out.println("Student id: " + s.getStudentId());
                System.out.println("Student name: " + s.getStudentName());
                System.out.println("Student cgpa: " + s.getStudentCgpa());
                System.out.println();
            }
        }
    }

    // print information of a course
    public static void printInfoOfACourse(String cCode) {
        for (Course c : coursesList) {
            if (c.getCourseCode().equals(cCode)) {
                System.out.println("Course code: " + c.getCourseCode());
                System.out.println("Course title: " + c.getCourseTitle());
                System.out.println("Course credit: " + c.getCourseCredit());
                System.out.println();
            }
        }
    }

    // print information of a faculty
    public static void printInfoOfAFaculty(int fID) {
        for (Faculty f : facultiesList) {
            if (f.getFacultyId() == fID) {
                System.out.println("Faculty id: " + f.getFacultyId());
                System.out.println("Faculty name: " + f.getFacultyName());
                System.out.println("Faculty position: " + f.getFacultyPosition());
                System.out.println();
            }
        }
    }

    // print student list and faculty information
    public static void printStudentListAndFacultyInfo() {
        int flag = 0;
        for (Course c : coursesList) {
            System.out.println(c.getStudentList().toString());
            System.out.println();
            Faculty faculty = c.getFaculty();

            if (faculty != null) {
                System.out.println("Faculty id: " + faculty.getFacultyId());
                System.out.println("Faculty name: " + faculty.getFacultyName());
                System.out.println("Faculty position: " + faculty.getFacultyPosition());
                System.out.println();
                flag = 1;
            } else if (flag == 0) {
                System.out.println("Faculty not found");
            }
        }
    }

    // Print courses taken by a student
    public static void printCourseTakenByStudent(int sId) {
        for (Course c : coursesList) {
            ArrayList<Student> studentsList = c.getStudentList();
            for (Student s : studentsList) {
                if (s.getStudentId() == sId) {
                    System.out.println("Course Code: " + c.getCourseCode());
                    System.out.println("Course Title: " + c.getCourseTitle());
                    System.out.println("Course Credit: " + c.getCourseCredit());
                    System.out.println();
                }
            }
        }
    }

    //---------------------------------------------------*****----------------------------------------------------------
    // search a student
    public static Student searchStudent(int sId) {
        for (Student s : studentsList) {
            if (s.getStudentId() == sId) {
                return s;
            }
        }
        return null;
    }

    // search a course
    public static Course searchCourse(String cCode) {
        for (Course c : coursesList) {
            if (c.getCourseCode().equals(cCode)) {
                return c;
            }
        }
        return null;
    }

    // search a faculty
    public static Faculty searchFaculty(int fId) {
        for (Faculty f : facultiesList) {
            if (f.getFacultyId() == fId) {
                return f;
            }
        }
        return null;
    }

    // search whether a student takes a course
    public static boolean whetherAStudentTakeACourse(int sId, String cCode) {
        Student s = searchStudent(sId);
        if (s == null) {
            return false;
        }

        Course c = searchCourse(cCode);
        if (c == null) {
            return false;
        }
        return c.getStudentList().contains(s);
    }

    // search whether a faculty teaches a course
    public static boolean whetherAFacultyTeachesACourse(int fId, String cCode) {
        Faculty f = searchFaculty(fId);
        if (f == null) {
            return false;
        }

        Course c = searchCourse(cCode);
        if (c == null) {
            return false;
        }
        return c.getFaculty() == f;
    }

    // search courses taken by a student
    public static ArrayList<Course> searchCoursesTakenByStudent(int sId) {
        ArrayList<Course> coursesTaken = new ArrayList<>();

        for (Course c : coursesList) {
            ArrayList<Student> studentsList = c.getStudentList();

            for (Student s : studentsList) {
                if (s.getStudentId() == sId) {
                    coursesTaken.add(c);
                    break;
                }
            }
        }
        return coursesTaken;
    }

    // search course taught by a faculty
    public static ArrayList<Course> searchCoursesTaughtByFaculty(int fId) {
        ArrayList<Course> coursesTaught = new ArrayList<>();

        for (Course c : coursesList) {
            Faculty faculty = c.getFaculty();

            if (faculty != null && faculty.getFacultyId() == fId) {
                coursesTaught.add(c);
            }
        }
        return coursesTaught;
    }

    //---------------------------------------------------*****----------------------------------------------------------
}