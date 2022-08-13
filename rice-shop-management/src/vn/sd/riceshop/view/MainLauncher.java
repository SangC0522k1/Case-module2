package vn.sd.riceshop.view;

import vn.sd.riceshop.utils.AppUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainLauncher {
    public static void launch() {
        LoginView loginView = new LoginView();
        loginView.login();
    }

    public static void menuOption() {
        do {
            mainMenu();
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("\nChọn chức năng ");
                System.out.print("⭆ ");
                int number = scanner.nextInt();
                switch (number) {
                    case 1:
                        UserViewLauncher.launch();
                        break;
                    case 2:
                        ProductViewLauncher.run();
                        break;
                    case 3:
                        OrderViewLauncher.run();
                        break;
                    case 0:
                        AppUtils.exit();
                    default:
                        System.out.println("Chọn chức năng không đúng! Vui lòng chọn lại");
                        menuOption();
                }

            } catch (InputMismatchException io) {
                System.out.println("Nhập sai! Vui lòng nhập lại");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }


    public static void mainMenu() {
        System.out.print("╔════════════════════════════════════════════════════════════════════════╗\n" +
                "║                                                                        ║\n" +
                "║                            MAIN MENU                                   ║\n" +
                "║                                                                        ║\n" +
                "║                   [1] Quản lý người dùng                               ║\n" +
                "║                   [2] Quản lý sản phẩm                                 ║\n" +
                "║                   [3] Quản lý đơn đặt hàng                             ║\n" +
                "║                   [0] Thoát                                            ║\n" +
                "╚════════════════════════════════════════════════════════════════════════╝\n");
    }

    public static void userMenu() {
        System.out.print("╔═════════════════════════════════════════════════════════════════════════╗\n" +
                "║                                                                         ║\n" +
                "║                           USER MANGEMENT                                ║\n" +
                "║                                                                         ║\n" +
                "║                   [1] Thêm người dùng                                   ║\n" +
                "║                   [2] Sửa thông tin người dùng                          ║\n" +
                "║                   [3] Hiển danh sách người dùng                         ║\n" +
                "║                   [4] Xóa người dùng                                    ║\n" +
                "║                   [5] Quay lại                                          ║\n" +
                "║                   [0] Thoát                                             ║\n" +
                "║                                                                         ║\n" +
                "╚═════════════════════════════════════════════════════════════════════════╝\n");
    }

    public static void productMenu() {
        System.out.print("╔═════════════════════════════════════════════════════════════════════════╗\n" +
                "║                                                                         ║\n" +
                "║                           PRODUCT MANGEMENT                             ║\n" +
                "║                                                                         ║\n" +
                "║                   [1] Thêm sản phẩm                                     ║\n" +
                "║                   [2] Sửa thông tin sản phẩm                            ║\n" +
                "║                   [3] Hiển thị sản phẩm                                 ║\n" +
                "║                   [4] Xóa sản phẩm                                      ║\n" +
                "║                   [5] Tìm kiếm sản phẩm                                 ║\n" +
                "║                   [6] Sắp xếp sản phẩm                                  ║\n" +
                "║                   [7] Quay lại                                          ║\n" +
                "║                   [0] Thoát                                             ║\n" +
                "║                                                                         ║\n" +
                "╚═════════════════════════════════════════════════════════════════════════╝\n");
    }

    public static void orderMenu() {
        System.out.print("╔════════════════════════════════════════════════════════╗\n" +
                "║                                                        ║\n" +
                "║                      ORDER MENU                        ║\n" +
                "║                                                        ║\n" +
                "║                   [1] Tạo order                        ║\n" +
                "║                   [2] Xem danh sách order              ║\n" +
                "║                   [3] Quay lại                         ║\n" +
                "║                   [0] Thoát                            ║\n" +
                "╚════════════════════════════════════════════════════════╝\n");
    }
}