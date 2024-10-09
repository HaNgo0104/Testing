package src;
public class TaxiFareCalculator {
    public static int calculateFare(int people, double S) {
        String vehicle;
        int total = 0;

        // Xác định loại xe dựa trên số người
        if (people == 1) {
            vehicle = "Xe máy";
        } else if (people >= 2 && people <= 4) {
            vehicle = "Ô tô 4 chỗ";
        } else if (people >= 5 && people <= 7) {
            vehicle = "Ô tô 7 chỗ";
        } else {
            throw new InvalidInputException("Input is invalid: " + people);
        }

        // Tính toán giá cước dựa trên loại xe và quãng đường
        if (vehicle.equals("Xe máy")) {
            if (S < 5) {
                total = (int) (S * 8000);
            } else if (S <= 10) {
                total = (int) (5 * 8000 + (S - 5) * 5000);
            } else {
                total = (int) (5 * 8000 + 5 * 5000 + (S - 10) * 3000);
            }
        } else if (vehicle.equals("Ô tô 4 chỗ")) {
            if (S <= 10) {
                total = (int) (S * 12000);
            } else {
                total = (int) (10 * 12000 + (S - 10) * 9000);
            }
        } else if (vehicle.equals("Ô tô 7 chỗ")) {
            if (S <= 20) {
                total = (int) (S * 15000);
            } else {
                total = (int) (20 * 15000 + (S - 20) * 10000);
            }
        } else {
            throw new InvalidInputException("Input is invalid: " + S);
        }

        return total;
    }
}
