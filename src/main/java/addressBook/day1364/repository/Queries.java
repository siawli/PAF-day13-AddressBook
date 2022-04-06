package addressBook.day1364.repository;

public interface Queries {
    public static final String SQL_FIND_WHETHER_EMAIL_EXIST = 
        "select count(*) from bff where email = ?";

    public static final String SQL_INSERT_INFORMATION = 
        "insert into bff (email, name, phone, dob, status, pass_phrase) values (?, ?, ?, ?, ?, ?)";

    public static final String SQL_SHA1 = 
        "update bff set pass_phrase = sha1(?) where email = ?";
    }
