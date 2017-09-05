package hackathonayush.mentor.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.BindView;
import hackathonayush.mentor.Adapter.GetMentorAdapter;
import hackathonayush.mentor.R;

/**
 * Created by user on 02-Sep-17.
 */

public class GetMentorFragment extends MentorFragment {

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_get_mentor;
    }

    @Override
    protected String setToolbarTitle() {
        return null;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new GetMentorAdapter());
    }

    public static GetMentorFragment getNewInstance(){
        GetMentorFragment getMentorFragment=new GetMentorFragment();
        return getMentorFragment;
    }
}
