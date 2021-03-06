package com.aserbao.aserbaosandroid.ui.animation.moveAnimation.angleShot;

import android.content.Context;
import android.graphics.Canvas;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;

/**
 * 功能:
 * author aserbao
 * date : On 2018/12/11
 * email: this is empty email
 */
public class MoveView extends View {

    public ArrayList<Shot> mShotList = new ArrayList<>();
    private Context mContext;

    public MoveView(Context context) {
        this(context,null);
    }

    public MoveView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MoveView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
    }


    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (mShotList != null) {
            for (int i = 0; i < mShotList.size(); i++) {
                mShotList.get(i).draw(canvas);
            }
        }
    }

    public void setmShotList(ArrayList<Shot> shotList){
        mShotList = shotList;
    }

}
