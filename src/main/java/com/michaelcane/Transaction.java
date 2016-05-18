package com.michaelcane;

public class Transaction {

    /**
     * The fields of the Transaction constructor
     */
    private int transactionType = 0;
    private int amountTransacted = 0;
    private int sourceOfTransaction = 0;
    private int destinationOfTransaction = 0;
    private int dateAndTimeOfTransaction = 0;
    private int financialTransactionNumber = 0;
    private int noDestinationTransaction = 0;


    /**
     * The Transaction constructor
     * @param transType
     * @param amntTrans
     * @param srcTrans
     * @param destTrans
     * @param date
     * @param ftn
     * @param noDest
     */
    public Transaction(int transType, int amntTrans, int srcTrans, int destTrans, int date, int ftn, int noDest) {
        this.transactionType = transType;
        this.amountTransacted = amntTrans;
        this.sourceOfTransaction = srcTrans;
        this.destinationOfTransaction = destTrans;
        this.dateAndTimeOfTransaction = date;
        this.financialTransactionNumber = ftn;
        this.noDestinationTransaction = noDest;
        transactionBuilder();
    }

    /**
     *
     * @return
     */
    public String transactionBuilder(){
        return transactionType + ", " + amountTransacted + ", " + sourceOfTransaction + ", " + destinationOfTransaction + ", " + dateAndTimeOfTransaction + ", " + financialTransactionNumber + ", " + noDestinationTransaction;
    }
}
