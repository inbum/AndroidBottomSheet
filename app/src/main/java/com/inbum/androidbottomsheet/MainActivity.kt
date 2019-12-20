package com.inbum.androidbottomsheet

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottom_sheet.*
import kotlinx.android.synthetic.main.bottom_sheet.view.*

class MainActivity : AppCompatActivity(), View.OnClickListener  {

    private lateinit var bottomSheetBehavior: BottomSheetBehavior<View>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
//        buttonSlideUp.setOnClickListener(this)
        buttonBottomSheetDialog.setOnClickListener(this)
        buttonBottomSheetDialogFragment.setOnClickListener(this)

        /*textViewFacebook.setOnClickListener {
            Toast.makeText(this, "Facebook", Toast.LENGTH_SHORT).show()
        }
        textViewTwitter.setOnClickListener {
            Toast.makeText(this, "Twitter", Toast.LENGTH_SHORT).show()
        }
        textViewInstagram.setOnClickListener {
            Toast.makeText(this, "Instagram", Toast.LENGTH_SHORT).show()
        }
        textViewLinkedin.setOnClickListener {
            Toast.makeText(this, "Linkedin", Toast.LENGTH_SHORT).show()
        }*/

        /*bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)
        bottomSheetBehavior.setBottomSheetCallback(object: BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(p0: View, p1: Float) {

            }

            override fun onStateChanged(bottomSheet: View, newState: Int) {
                when (newState) {
                    BottomSheetBehavior.STATE_COLLAPSED -> {
                        buttonSlideUp.text = "Slide Up"
                    }
                    BottomSheetBehavior.STATE_HIDDEN -> {

                    }
                    BottomSheetBehavior.STATE_EXPANDED -> {
                        buttonSlideUp.text = "Slide Down"
                    }
                    BottomSheetBehavior.STATE_DRAGGING -> {

                    }
                    BottomSheetBehavior.STATE_SETTLING -> {

                    }
                }
            }
        })*/

    }

    override fun onClick(clickView: View?) {
        when (clickView) {
            /*buttonSlideUp -> {
                slideUpDownBottomSheet()
            }*/
            buttonBottomSheetDialog -> {
                showBottomSheetDialog()
            }
            buttonBottomSheetDialogFragment -> {
                showBottomSheetDialogFragment()
            }
        }
    }

    /***
     * Manually Slide up and Slide Down
     */
    /*private fun slideUpDownBottomSheet() {
        if (bottomSheetBehavior.state != BottomSheetBehavior.STATE_EXPANDED) {
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
            buttonSlideUp.text = "Slide Down";
        } else {
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED;
            buttonSlideUp.text = "Slide Up"
        }
    }*/


    private fun showBottomSheetDialogFragment() {
        val bottomSheetFragment = BottomSheetFragment()
        bottomSheetFragment.show(supportFragmentManager, bottomSheetFragment.tag)
    }

    private fun showBottomSheetDialog() {
        val view = layoutInflater.inflate(R.layout.bottom_sheet, null)
        val dialog = BottomSheetDialog(this)
        dialog.setContentView(view)
        view.textViewFacebook.setOnClickListener {
            Toast.makeText(this, "Facebook", Toast.LENGTH_SHORT).show()
        }
        view.textViewTwitter.setOnClickListener {
            Toast.makeText(this, "Twitter", Toast.LENGTH_SHORT).show()
        }
        view.textViewInstagram.setOnClickListener {
            Toast.makeText(this, "Instagram", Toast.LENGTH_SHORT).show()
        }
        view.textViewLinkedin.setOnClickListener {
            Toast.makeText(this, "Linkedin", Toast.LENGTH_SHORT).show()
        }
        dialog.show()
    }
}
