package assessmentDay;
//
//
//Java Exceptions: Digital Wallet
//
//        Digital wallets have made seg and receiving money easier, but they require authentication. A user must have an access token to initiate transactions in this digital wallet system. There are two types of transactions:
//
//        Adding money to the wallet. Paying money from the wallet.
//
//        Both the transactions are validated before being processed. For an invalid transaction the following error code and the error message are displayed
//
//        USER NOT AUTHORIZED The error code reports the unauthorized transaction, Le.. if there is no access token for the digital wallet. The error message should be User not authorized
//
//        INVALID AMOUNT The error code reports the attempt of adding or paying zero or negative amount. The error message should be Amount should be greater than zera
//
//        INSUFFICIENT BALANCE The error code reports the attempt of making a payment greater than the available digital wallet balance. The error message should be insufficient aface
//
//        In this challenge, you are building the digital waller workflow by writing the complete implementation of the following three classes:
//
//        The TransactionException class should plent The constructor TransactionExceptions
public class DigitalWallet {
    private String walletId;
    private String userName;
    private String userAccessCode;
    private int walletBalance;

    public DigitalWallet(String walletId, String userName, String userAccessCode, int walletBalance) {
        this.walletId = walletId;
        this.userName = userName;
        this.userAccessCode = userAccessCode;
        this.walletBalance = walletBalance;
    }

    public String getWalletId() {
        return walletId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserAccessCode() {
        return userAccessCode;
    }

    public int getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(int walletBalance) {
        this.walletBalance = walletBalance;
    }

    public void addMoney(int amount, String accessCode) throws TransactionException {
        if (accessCode.equals(userAccessCode)) {
            if (amount > 0) {
                walletBalance += amount;
            } else {
                throw new TransactionException("INVALID AMOUNT", "Amount should be greater than zero");
            }
        } else {
            throw new TransactionException("USER NOT AUTHORIZED", "User not authorized");
        }
    }

    public void payMoney(int amount, String accessCode) throws TransactionException {
        if (accessCode.equals(userAccessCode)) {
            if (amount > 0) {
                if (walletBalance >= amount) {
                    walletBalance -= amount;
                } else {
                    throw new TransactionException("INSUFFICIENT BALANCE", "Insufficient balance");
                }
            } else {
                throw new TransactionException("INVALID AMOUNT", "Amount should be greater than zero");
            }
        } else {
            throw new TransactionException("USER NOT AUTHORIZED", "User not authorized");
        }
    }

    class TransactionException extends Exception {
        private String errorCode;
        private String errorMessage;

        public TransactionException(String errorCode, String errorMessage) {
            this.errorCode = errorCode;
            this.errorMessage = errorMessage;
        }

        public String getErrorCode() {
            return errorCode;
        }

        public String getErrorMessage() {
            return errorMessage;
        }
    }

    public static void main(String[] args) {
        DigitalWallet wallet = new DigitalWallet("WALLET001", "John Doe", "ACCESSCODE001", 1000);
        try {
            wallet.addMoney(500, "ACCESSCODE001");
            System.out.println(wallet.getWalletBalance());
            wallet.payMoney(2000, "ACCESSCODE001");
            System.out.println(wallet.getWalletBalance());
        } catch (TransactionException e) {
            System.out.println(e.getErrorCode() + ": " + e.getErrorMessage());
        }
    }
}
