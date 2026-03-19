class OTPGenerator {

    // Method to generate OTP
    static int[] generateOTP(int size) {
        int[] otp = new int[size];

        for (int i = 0; i < size; i++) {
            otp[i] = (int)(Math.random() * 10); // 0 to 9
        }
        return otp;
    }

    // Method to display OTP
    static void displayOTP(int[] otp) {
        System.out.print("Generated OTP: ");
        for (int digit : otp)
            System.out.print(digit);
    }

    public static void main(String[] args) {

        int[] otp = generateOTP(6);
        displayOTP(otp);
    }
}
