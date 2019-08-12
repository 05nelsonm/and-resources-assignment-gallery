package sats.stackemhigh.galleryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val views = ArrayList<ImageView>()

        // Fill the array with image views to set drawables to such that type mismatch is avoided
        for (i in 0..9) {
            views.add(i, ImageView(this))
        }

        // Add drawables to each element of the `views` array
        views[0].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.aerial_photography_aerial_shot_aerial_view_2583847))
        views[1].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.afterglow_beach_cliff_2555285))
        views[2].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.alley_architecture_buildings_2526517))
        views[3].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.architectural_design_architecture_bridge_2540653))
        views[4].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.beautiful_breathtaking_canada_day_2526105))
        views[5].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.bloom_blossom_flora_2567011))
        views[6].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.close_up_colorful_colors_2529148))
        views[7].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.clouds_coconut_trees_daylight_2486168))
        views[8].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.colorful_colourful_houses_2501965))
        views[9].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.wallpaper_astronomy_astrophotography_2538107))

        val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)

        views.forEachIndexed { index, thisImageView ->
            thisImageView.layoutParams = layoutParams
            thisImageView.adjustViewBounds = true
            thisImageView.setPadding(0, 10, 0, 10)
            when {
                index % 2 == 0 -> ll_left_column.addView(thisImageView)
                else -> ll_right_column.addView(thisImageView)
            }
        }
    }
}
