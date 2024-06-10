public class NewMain {
    //1.
//    public class BasicTryCatch {
//        public static void main(String[] args) {
//            int a = 10;
//            int b = 0; // This will cause an ArithmeticException
//
//            try {
//                int result = a / b;
//                System.out.println("Result: " + result);
//            } catch (ArithmeticException e) {
//                System.out.println("Error: Division by zero is not allowed.");
//            }
//        }
//    }
    // 2.
//    public class MultipleCatchBlocks {
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            try {
//                System.out.println("Enter the first number:");
//                int a = Integer.parseInt(scanner.nextLine());
//
//                System.out.println("Enter the second number:");
//                int b = Integer.parseInt(scanner.nextLine());
//
//                int result = a / b;
//                System.out.println("Result: " + result);
//            } catch (ArithmeticException e) {
//                System.out.println("Error: Division by zero is not allowed.");
//            } catch (NumberFormatException e) {
//                System.out.println("Error: Please enter a valid number.");
//            }
//        }
//    }
    //3.
//    public class FinallyBlock {
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            try {
//                System.out.println("Enter the first number:");
//                int a = Integer.parseInt(scanner.nextLine());
//
//                System.out.println("Enter the second number:");
//                int b = Integer.parseInt(scanner.nextLine());
//
//                int result = a / b;
//                System.out.println("Result: " + result);
//            } catch (ArithmeticException e) {
//                System.out.println("Error: Division by zero is not allowed.");
//            } catch (NumberFormatException e) {
//                System.out.println("Error: Please enter a valid number.");
//            } finally {
//                System.out.println("End of program.");
//                scanner.close();
//            }
//        }
//    }
    //4.
//    public class ThrowingException {
//        public static void checkIfNegative(int number) {
//            if (number < 0) {
//                throw new IllegalArgumentException("Number is negative: " + number);
//            }
//        }
//
//        public static void main(String[] args) {
//            try {
//                checkIfNegative(-5);
//            } catch (IllegalArgumentException e) {
//                System.out.println("Caught an exception: " + e.getMessage());
//            }
//        }
//    }
    //5.
//    class OutOfRangeValueException extends Exception {
//        public OutOfRangeValueException(String message) {
//            super(message);
//        }
//    }
//
//    public class CustomException {
//        public static void checkRange(int number, int min, int max) throws OutOfRangeValueException {
//            if (number < min || number > max) {
//                throw new OutOfRangeValueException("Number " + number + " is out of range (" + min + " - " + max + ").");
//            }
//        }
//
//        public static void main(String[] args) {
//            try {
//                checkRange(150, 0, 100);
//            } catch (OutOfRangeValueException e) {
//                System.out.println("Caught an exception: " + e.getMessage());
//            }
//        }
//    }
    //*********************************//
    //1.
//    public class NestedTryCatch {
//        public static void main(String[] args) {
//            int[] numbers = {10, 0};
//
//            try {
//                try {
//                    int result = numbers[0] / numbers[1];
//                    System.out.println("Result: " + result);
//                } catch (ArithmeticException e) {
//                    System.out.println("Error: Division by zero is not allowed.");
//                }
//                System.out.println(numbers[2]); // This will cause an ArrayIndexOutOfBoundsException
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("Error: Array index is out of bounds.");
//            }
//        }
//    }
    //2.
//    public class ExceptionPropagation {
//        public static void methodB() throws Exception {
//            throw new Exception("Exception thrown in method B");
//        }
//
//        public static void methodA() {
//            try {
//                methodB();
//            } catch (Exception e) {
//                System.out.println("Exception caught in method A: " + e.getMessage());
//            }
//        }
//
//        public static void main(String[] args) {
//            methodA();
//        }
//    }
    //3.
//    public class MultipleExceptions {
//        public static void main(String[] args) {
//            try {
//                int result = 10 / 0; // This will cause ArithmeticException
//                String text = null;
//                text.length(); // This will cause NullPointerException
//                int[] numbers = new int[2];
//                System.out.println(numbers[5]); // This will cause ArrayIndexOutOfBoundsException
//            } catch (Exception e) {
//                System.out.println("An exception occurred: " + e.getMessage());
//            }
//        }
//    }
    //4.
//    public class ThrowsKeyword {
//        public static void methodWithIOException() throws IOException {
//            throw new IOException("This is an IOException");
//        }
//
//        public static void main(String[] args) {
//            try {
//                methodWithIOException();
//            } catch (IOException e) {
//                System.out.println("Caught IOException: " + e.getMessage());
//            }
//        }
//    }
    //5.
//    public class ChainedExceptions {
//        public static void methodThatThrows() throws Exception {
//            try {
//                throw new NullPointerException("This is the original exception");
//            } catch (NullPointerException e) {
//                throw new Exception("This is the new exception caused by the original one", e);
//            }
//        }
//
//        public static void main(String[] args) {
//            try {
//                methodThatThrows();
//            } catch (Exception e) {
//                System.out.println("Caught exception: " + e.getMessage());
//                System.out.println("Caused by: " + e.getCause());
//            }
//        }
//    }

}
