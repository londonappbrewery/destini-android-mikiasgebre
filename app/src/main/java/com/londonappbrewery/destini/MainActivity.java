package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
        private TextView storyTextView;
        private Button buttonTop;
        private Button buttonBottom;
        private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
            storyTextView = (TextView) findViewById(R.id.storyTextView);
            buttonTop = (Button) findViewById(R.id.buttonTop);
            buttonBottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

            buttonTop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(mStoryIndex == 1) {
                        storyTextView.setText(R.string.T3_Story);
                        buttonTop.setText(R.string.T3_Ans1);
                        buttonBottom.setText(R.string.T3_Ans2);
                        mStoryIndex = mStoryIndex +1;
                        Log.d("destini","variable"+mStoryIndex);

                    }
                    else if(mStoryIndex == 2)
                    {
                        storyTextView.setText(R.string.T6_End);
                        buttonBottom.setVisibility(View.GONE);
                        buttonTop.setVisibility(View.GONE);

                    }

                    else if(mStoryIndex == 3)
                    {
                        storyTextView.setText(R.string.T3_Story);
                        buttonBottom.setText(R.string.T3_Ans2);
                        buttonTop.setText(R.string.T3_Ans1);
                        mStoryIndex += mStoryIndex +2;
                        Log.d("destini","variable"+mStoryIndex);
                    }
                    else if(mStoryIndex == 8)
                    {
                        storyTextView.setText(R.string.T3_Ans1);
                        buttonBottom.setVisibility(View.GONE);
                        buttonTop.setVisibility(View.GONE);
                    }

                }
            });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1) {
                    storyTextView.setText(R.string.T2_Story);
                    buttonBottom.setText(R.string.T2_Ans1);
                    buttonTop.setText(R.string.T2_Ans2);
                    mStoryIndex = mStoryIndex+2;
                    Log.d("destini","Bottom variable "+mStoryIndex);
                }
                else if(mStoryIndex == 3)
                {
                    storyTextView.setText(R.string.T4_End);
                    mStoryIndex = 0;
                    buttonBottom.setVisibility(View.GONE);
                    buttonTop.setVisibility(View.GONE);
                    Log.d("destini","Bottom variable"+mStoryIndex);

                }

                else if(mStoryIndex == 8)
                {
                    storyTextView.setText(R.string.T3_Ans2);
                    buttonBottom.setVisibility(View.GONE);
                    buttonTop.setVisibility(View.GONE);
                    Log.d("destini","Bottom final" + mStoryIndex);

                }

            }
        });
    }
}
