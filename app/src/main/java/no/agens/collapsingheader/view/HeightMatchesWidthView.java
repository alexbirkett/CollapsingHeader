package no.agens.collapsingheader.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class HeightMatchesWidthView extends View {
    public HeightMatchesWidthView(Context context) {
        super(context);
    }

    public HeightMatchesWidthView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HeightMatchesWidthView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = MeasureSpec.getSize(widthMeasureSpec);
        setMeasuredDimension(width, width);
    }
}
