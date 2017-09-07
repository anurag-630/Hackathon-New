package hackathonayush.mentor.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by kunwar on 7/9/17.
 */

public class StudentSignUp {

    @Expose
    @SerializedName("name")
    String name;

    @Expose
    @SerializedName("email")
    String email;

    @Expose
    @SerializedName("registration")
    String status;


}
