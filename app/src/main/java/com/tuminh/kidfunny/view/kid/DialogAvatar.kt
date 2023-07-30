package com.tuminh.kidfunny.view.kid

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.DialogFragment
import com.tuminh.kidfunny.R
import de.hdodenhof.circleimageview.CircleImageView

class DialogAvatar: DialogFragment() {
    interface CustomDialogListener{
        fun onDialogNextButtonClicked(idImage:Int)
    }
    private var listener: CustomDialogListener? = null

    fun setCustomDialogListener(listener: CustomDialogListener){
        this.listener = listener
    }

    private lateinit var imageView1: CircleImageView
    private lateinit var imageView2: CircleImageView
    private lateinit var imageView3: CircleImageView
    private lateinit var imageView4: CircleImageView
    private lateinit var imageView5: CircleImageView
    private lateinit var imageView6: CircleImageView
    private lateinit var imageView7: CircleImageView
    private lateinit var imageView8: CircleImageView


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(requireContext())
        val inflater = LayoutInflater.from(requireContext())
        val view = inflater.inflate(R.layout.dialog_avatar_select,null)

        imageView1 = view.findViewById(R.id.civ_avatar_1)
        imageView2 = view.findViewById(R.id.civ_avatar_2)
        imageView3 = view.findViewById(R.id.civ_avatar_3)
        imageView4 = view.findViewById(R.id.civ_avatar_4)
        imageView5 = view.findViewById(R.id.civ_avatar_5)
        imageView6 = view.findViewById(R.id.civ_avatar_6)
        imageView7 = view.findViewById(R.id.civ_avatar_7)
        imageView8 = view.findViewById(R.id.civ_avatar_8)

        setEventHandler()

        builder.setView(view)
        return builder.create()

    }

    private fun setEventHandler() {
        imageView1.setOnClickListener {
            val idImage = R.drawable.img_ava_1
            listener?.onDialogNextButtonClicked(idImage)
            dialog?.dismiss()

        }
        imageView2.setOnClickListener {
            val idImage = R.drawable.img_ava_2
            listener?.onDialogNextButtonClicked(idImage)
            dialog?.dismiss()
        }
        imageView3.setOnClickListener {
            val idImage = R.drawable.img_ava_3
            listener?.onDialogNextButtonClicked(idImage)
            dialog?.dismiss()
        }
        imageView4.setOnClickListener {
            val idImage = R.drawable.img_ava_4
            listener?.onDialogNextButtonClicked(idImage)
            dialog?.dismiss()
        }
        imageView5.setOnClickListener {
            val idImage = R.drawable.img_ava_5
            listener?.onDialogNextButtonClicked(idImage)
            dialog?.dismiss()
        }
        imageView6.setOnClickListener {
            val idImage = R.drawable.img_ava_6
            listener?.onDialogNextButtonClicked(idImage)
            dialog?.dismiss()
        }
        imageView7.setOnClickListener {
            val idImage = R.drawable.img_ava_7
            listener?.onDialogNextButtonClicked(idImage)
            dialog?.dismiss()
        }
        imageView8.setOnClickListener {
            val idImage = R.drawable.img_ava_8
            listener?.onDialogNextButtonClicked(idImage)
            dialog?.dismiss()
        }
    }


}