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


class DigitalWallet {
    private String walletId;
    private String userName;
    private String userAccessCode;
    private int walletBalance;

    public DigitalWallet(String walletId, String userName) {
        this.walletId = walletId;
        this.userName = userName;
    }
    public DigitalWallet(String walletId, String userName, String userAccessCode) {
        this.walletId = walletId;
        this.userName = userName;
        this.userAccessCode = userAccessCode;
    }

    public String getWalletId() {
        return walletId;
    }

    public String getUserAccessToken() {
        return userAccessCode;
    }

    public int getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(int walletBalance) {
        this.walletBalance = walletBalance;
    }

    class DigitalWalletTransaction {
        public void addMoney(DigitalWallet digitalWallet, int amount) throws TransactionException {
            if (digitalWallet.getUserAccessToken() == null) {
                throw new TransactionException("User not authorized", "USER_NOT_AUTHORIZED");
            }
            if (amount <= 0) {
                throw new TransactionException("Amount should be greater than zero", "INVALID_AMOUNT");
            }
            digitalWallet.setWalletBalance(amount);
        }

        public void payMoney (DigitalWallet digitalWallet, int amount) throws TransactionException {
            if (digitalWallet.getUserAccessToken() == null) {
                throw new TransactionException("User not authorized", "USER_NOT_AUTHORIZED");
            }
            if (amount <= 0) {
                throw new TransactionException("Amount should be greater than zero", "INVALID_AMOUNT");
            }
            if (amount > digitalWallet.getWalletBalance()) {
                throw new TransactionException("Insufficient balance", "INVALID_AMOUNT");
            }
            digitalWallet.setWalletBalance(amount);
        }
    }


    class TransactionException extends Exception {
        private String errorCode;
        private String errorMessage;

        public TransactionException(String errorMessage, String errorCode) {
            this.errorMessage = errorMessage;
            this.errorCode = errorCode;
        }

        public String getErrorCode() {
            return errorCode;
        }

        public String getErrorMessage() {
            return errorMessage;
        }
    }
}
