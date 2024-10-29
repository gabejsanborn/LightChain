package LightChain;

public class TransactionInput {

    public String transactionOutputId; // reference to transactionOutputs -> transactionOutputId
    public TransactionOutput UTXO; // contains the unspect transaction amount

    public TransactionInput(String transactionOutputId) {

        this.transactionOutputId = transactionOutputId;
    }
}
