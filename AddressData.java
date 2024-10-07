public class AddressData {
    private String Name;
    private String Kana;
    private String Phone;
    private String Mail;

public AddressData(String Name, String Kana, String Phone, String Mail){
    this.Name = Name;
    this.Kana = Kana;
    this.Phone = Phone;
    this.Mail = Mail;
}

    public void print() {
        System.out.println(
                "Name : " + Name + "\n" + "Kana : " + Kana + "\n" + "Phone : " + Phone + "\n" + "Mail : " + Mail);
    }

}