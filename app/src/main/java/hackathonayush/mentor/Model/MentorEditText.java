package hackathonayush.mentor.Model;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.widget.EditText;

import com.rengwuxian.materialedittext.MaterialEditText;

/**
 * Created by user on 14-Jun-17.
 */

//use this view for complete app.........

public class MentorEditText extends AppCompatEditText {

    private static final String LIGHT_FONT = "fonts/Ubuntu-Light.ttf";

    public MentorEditText(Context context) {
        super(context);
        setFocusableInTouchMode(true);
    }

    public MentorEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFocusableInTouchMode(true);
    }

    public MentorEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFocusableInTouchMode(true);
    }

    @Override
    public void setTypeface(Typeface tf) {
        super.setTypeface(tf.createFromAsset(getContext().getAssets(),LIGHT_FONT));
    }

    @Override
    public void setFocusableInTouchMode(boolean focusableInTouchMode) {
        super.setFocusableInTouchMode(focusableInTouchMode);
    }
}
