package com.mmuu.travel.client.ui.other;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

import com.mmuu.travel.client.R;
import com.mmuu.travel.client.base.MFBaseActivity;

/**
 * 建议act
 */

public class AdviseAct extends MFBaseActivity {
    private AdviseFrg adviseFrg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.slide_in_left, R.anim.activity_push_no_anim);
        setContentView(R.layout.mf_base_act);
        adviseFrg = new AdviseFrg();
        FragmentTransaction transaction = getSupportFragmentManager()
                .beginTransaction();
        transaction.replace(R.id.base_contextlayout, adviseFrg);
        transaction.commitAllowingStateLoss();

    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.activity_push_no_anim, R.anim.slide_out_right);
    }
}
