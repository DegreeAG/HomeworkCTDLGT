package view;

import Util.InputUtil;
import entity.Student;
import service.StudentService;

public class Menu {
    private final StudentService service = new StudentService();
    private Student[] students;

    public void menu() {
        service.inputInfo();
        while (true) {
            System.out.println("==================================================================");
            System.out.println("1. Sắp xếp theo tên tuổi");
            System.out.println("2. Sắp xếp theo tuổi và GPA");
            System.out.println("3. Sắp xếp theo tên cuối");
            System.out.println("4. Thoát");
            int choice = InputUtil.chooseOption("Xin mời chọn chức năng",
                    "Chức năng là số dương từ 1 tới 3, vui lòng nhập lại: ", 1, 4);
            switch (choice) {
                case 1:
                    service.sortByNameAndAge(students);
                    break;
                case 2:
                    service.sortByAgeAndGPA(students);
                    break;
                case 3:
                    service.sortByLastName(students);
                    break;
                case 4:
                    return;
            }
        }
    }
}
