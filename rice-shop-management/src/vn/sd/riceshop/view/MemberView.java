package vn.sd.riceshop.view;

import vn.sd.riceshop.utils.AppUtils;

import java.util.Scanner;

public class MemberView {
    public static void launch() {
        int option;
        do {
            System.out.print("╔═══════════════════════════════════════════════════════════════════════════════╗\n" +
                    "║                                                                               ║\n" +
                    "║                            MEMBER MENU                                        ║\n" +
                    "║                                                                               ║\n" +
                    "║                      [1] Hiển thị sản phẩm                                    ║\n" +
                    "║                      [2] Tìm kiếm sản phẩm                                    ║\n" +
                    "║                      [3] Sắp xếp sản phẩm                                     ║\n" +
                    "║                      [4] Tạo Order                                            ║\n" +
                    "║                      [5] Xem danh sách Order                                  ║\n" +
                    "║                      [0] Thoát                                                ║\n" +
                    "║                                                                               ║\n" +
                    "╚═══════════════════════════════════════════════════════════════════════════════╝\n");
            Scanner scanner = new Scanner(System.in);
            ProductView productView = new ProductView();
            OrderView orderView = new OrderView();
            System.out.println("\nChọn chức năng: ");
            option = AppUtils.retryChoose(0,6);
            switch (option) {
                case 1:
                    productView.showProducts(InputOption.SHOW);
                    break;
                case 2:
                    productView.findProduct();
                    break;
                case 3:
                    productView.sortByPrice();
                    break;
                case 4:
                    orderView.addOrder();
                    break;
                case 5:
                    orderView.showAllOrder();
                    break;
                case 0:
                    AppUtils.exit();
                    break;
                default:
                    System.err.println("Chọn chức năng không đúng! Vui lòng chọn lại");
                    launch();
            }
        } while (true);
    }
}
