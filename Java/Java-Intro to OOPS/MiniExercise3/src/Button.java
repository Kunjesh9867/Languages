public interface Button {
    //The following defines 2 constant values.
    //I've built constants with such naming convention since constant values should always be in UPPERCASE.
    public String FIRST_VALUE  = "Open Instagram"; 
    public String SECOND_VALUE  = "Open Camera";


    // 2 interface methods without body is created below:
    void leftButton(String value);  
    void rightButton(String value);

}
