package co.com.bancolombia.certification.advantagedemo.models;

public class BuyLaptopModel {
    private String username;
    private String password;
    private String txtQuantity;
    private String finalResultMessage;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTxtQuantity() {
        return txtQuantity;
    }

    public void setTxtQuantity(String txtQuantity) {
        this.txtQuantity = txtQuantity;
    }

    public String getFinalResultMessage() {
        return finalResultMessage;
    }

    public void setFinalResultMessage(String finalResultMessage) {
        this.finalResultMessage = finalResultMessage;
    }

    public BuyLaptopModel(String username, String password, String txtQuantity, String finalResultMessage) {
        this.username = username;
        this.password = password;
        this.txtQuantity = txtQuantity;
        this.finalResultMessage = finalResultMessage;
    }
}
