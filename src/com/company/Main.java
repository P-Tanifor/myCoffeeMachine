package com.company;


import java.text.NumberFormat;
import java.util.*;


public class Main {



    public static int[] initialContent() {
        int[] initialContent = new int[6];
        int containedWater = 400;
        int containedMilk = 540;
        int containedCoffeeBeans = 120;
        int containedCups = 9;
        int containedMoney = 550;
        initialContent[0] = containedWater;
        initialContent[1] = containedMilk;
        initialContent[2] = containedCoffeeBeans;
        initialContent[3] = containedCups;
        initialContent[4] = containedMoney;

        return initialContent;
    }



    public static int[] buy() {
        int containedWater = 400;
        int containedMilk = 540;
        int containedCoffeeBeans = 120;
        int containedCups = 9;
        int containedMoney = 550;
        Scanner scanner = new Scanner(System.in);
        System.out.println("what do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String coffeeType = scanner.next();
        int coffeeChoice = 0;
        if ("1".equals(coffeeType) || "2".equals(coffeeType) || "3".equals(coffeeType)) {
            coffeeChoice = Integer.parseInt(coffeeType);
        } else if ("back".equals(coffeeType)) {
            coffeeChoice = 4;
        }
        while (true) {
            if (coffeeChoice == 1) {
                int[] outputs = new int[6];
                outputs[0] = containedWater;
                outputs[1] = containedMilk;
                outputs[2] = containedCoffeeBeans;
                outputs[3] = containedCups;
                outputs[4] = containedMoney;
                outputs[5] = coffeeChoice;
                return outputs;

            } else if (coffeeChoice == 2) {
                int[] outputs = new int[6];
                outputs[0] = containedWater;
                outputs[1] = containedMilk;
                outputs[2] = containedCoffeeBeans;
                outputs[3] = containedCups;
                outputs[4] = containedMoney;
                outputs[5] = coffeeChoice;
                return outputs;

            } else if (coffeeChoice == 3) {
                int[] outputs = new int[6];
                outputs[0] = containedWater;
                outputs[1] = containedMilk;
                outputs[2] = containedCoffeeBeans;
                outputs[3] = containedCups;
                outputs[4] = containedMoney;
                outputs[5] = coffeeChoice;
                return outputs;
            } else if (coffeeChoice == 4) {
                int[] outputs = new int[6];
                outputs[5] = coffeeChoice;
                return outputs;
            }
        }

    }

    public static int[] fill() {

        Scanner scanner = new Scanner(System.in);
        int[] outputs = new int[5];
        System.out.println("Write how many ml of water do you want to add:");
        int addedWater = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        int addedMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int addedCoffee = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int addedDisposableCups = scanner.nextInt();

        outputs[0] = addedWater;
        outputs[1] = addedMilk;
        outputs[2] = addedCoffee;
        outputs[3] = addedDisposableCups;
        return outputs;
    }



    public static void printOutput (int[] output) {
        System.out.println("The coffee machine has:");
        System.out.println(output[0] + " of water");
        System.out.println(output[1] + " of milk");
        System.out.println(output[2] + " of coffee beans");
        System.out.println(output[3] + " of disposable cups");
        System.out.println("$" + output[4] + " of money");
    }


//    public static boolean changeBalance(Account account, Operation operation, Long sum) {
//        // write your implementation here
//        boolean isChanged = false;
//        switch(operation) {
//            case DEPOSIT: {
//                account.balance = account.balance + sum;
//                isChanged = true;
//                break;
//            }
//            case WITHDRAW: {
//                if (account.balance < sum) {
//                    System.out.println("Not enough money to withraw.");
//                } else {
//                    account.balance = account.balance - sum;
//                    isChanged = true;
//                    break;
//                }
//            }
//        }
//        return isChanged;
//    }
//
//    enum Operation {
//        /**
//         * deposit (add) an amount into an Account
//         */
//        DEPOSIT,
//        /**
//         * withdraw (subtract) an amount from an Account
//         */
//        WITHDRAW
//    }
//
//    static class Account {
//
//        private String code;
//        private Long balance;
//
//        public String getCode() {
//            return code;
//        }
//
//        public Long getBalance() {
//            return balance;
//        }
//
//        public void setBalance(Long balance) {
//            this.balance = balance;
//
//        }
//    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] remaining = new int[6];
        remaining = initialContent();
        while (true) {
            //initialContent();
            System.out.println("Write an action (buy, fill, take, remaining, exit:)");
            String enterAction = scanner.next();
            if ("buy".equals(enterAction)) {
                int[] output = buy();
                if (output[5] == 1) {
                    if (remaining[0] - 250 >= 0) {
                        if (remaining[2] - 16 >= 0) {
                            remaining[0] -= 250;
                            remaining[2] -= 16;
                            remaining[3] -= 1;
                            remaining[4] += 4;
                            System.out.println("I have enough resources, making you a coffee");
                        } else {
                            System.out.println("sorry, not enough coffee beans");
                        }

                    } else {
                        System.out.println("sorry, not enough water");
                    }

                } else if (output[5] == 2) {
                    if (remaining[0] - 350 >= 0) {
                        if (remaining[1] - 75 >= 0) {
                            if (remaining[2] - 20 >= 0) {
                                remaining[0] -= 350;
                                remaining[1] -= 75;
                                remaining[2] -= 20;
                                remaining[3] -= 1;
                                remaining[4] += 7;
                                System.out.println("I have enough resources, making you a coffee");
                            } else {
                                System.out.println("sorry, not enough coffee beans");
                            }
                        } else {
                            System.out.println("sorry, not enough milk");
                        }
                    } else {
                        System.out.println("sorry, not enough water");
                    }
                } else if (output[5] == 3) {
                    if (remaining[0] - 200 >= 0) {
                        if (remaining[1] - 100 >= 0) {
                            if (remaining[2] - 12 >= 0) {
                                remaining[0] -= 200;
                                remaining[1] -= 100;
                                remaining[2] -= 12;
                                remaining[3] -= 1;
                                remaining[4] += 6;
                                System.out.println("I have enough resources, making you a coffee");
                            } else {
                                System.out.println("sorry, not enough coffee beans");
                            }
                        } else {
                            System.out.println("sorry, not enough milk");
                        }
                    } else {
                        System.out.println("sorry, not enough water");
                    }
                } else if (output[5] == 4) {
                    continue;
                }

            } else  if ("fill".equals(enterAction)) {
                int[] output = fill();
                //printOutput(output);
                int moneyPriorToFill = remaining[4];
                for (int i = 0;i < 5; i++) {
                    remaining[i] = remaining[i] + output[i];
                }
                remaining[4] = moneyPriorToFill;

            } else if ("take".equals(enterAction)) {
                //int[] output = take();
                //output[4] = remaining[4];
                System.out.println("I gave you $" + remaining[4]);
                remaining[4] = 0;
            } else if ("remaining".equals(enterAction)) {
                printOutput(remaining);
            }  else if ("exit".equals(enterAction)) {
                break;
            }
        }


//        Scanner scanner = new Scanner(System.in);
//        String[] arr = new String[0];
//
//        arr = scanner.nextLine().split(" ");
//
//        int[] array = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
//        //System.out.println(Arrays.toString(array));
//
//        int rotateBy = scanner.nextInt();
//        if (rotateBy > array.length) {
//            rotateBy = rotateBy % array.length;
//        }
//
//        for (int i = 0; i < rotateBy; i++) {
//            //if (rotateBy > array.length) {
//                //rotateBy = rotateBy % array.length;
//                //System.out.println(array.length);
//            //}
//            int j, last;
//            last = array[array.length - 1];
//
//            for (j = array.length - 1; j > 0; j--) {
//                array[j] = array[j - 1];
//            }
//            array[0] = last;
//        }
//        for (int i : array) {
//            System.out.print( i + " ");
//        }


//        Scanner scanner = new Scanner(System.in);
//
//        String[] parts = scanner.nextLine().split("\\s+");
//
//        Account account = new Account();
//        account.setBalance(Long.parseLong(parts[0]));
//
//        Operation operation = Operation.valueOf(parts[1]);
//
//        Long sum = Long.parseLong(parts[2]);
//
//        if (changeBalance(account, operation, sum)) {
//            System.out.println(account.getBalance());
//        }






    }
}

