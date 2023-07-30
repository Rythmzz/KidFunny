package com.tuminh.kidfunny.view.kid

import android.app.DatePickerDialog
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.tuminh.kidfunny.ActivityMainPage
import com.tuminh.kidfunny.R
import com.tuminh.kidfunny.data.SharedPrefManager
import com.tuminh.kidfunny.databinding.ActivityKidAboutPageBinding
import java.text.SimpleDateFormat
import java.util.*

class ActivityKidAboutPage:AppCompatActivity(),DialogAvatar.CustomDialogListener, DatePickerDialog.OnDateSetListener {

    private lateinit var binding:ActivityKidAboutPageBinding
    private lateinit var sharedManager: SharedPrefManager
    private var gender:Int = 0
    private var isPickImage = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKidAboutPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedManager = SharedPrefManager(this)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = Color.parseColor("#EB266D")
        }
        checkInfo()
        setEventHandler()
    }

    private fun checkInfo() {
        if (!sharedManager.isFirstLaunch()){
            val intent = Intent(this,ActivityMainPage::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun setEventHandler() {
        binding.civAvatar.setOnClickListener {
            showAvatarDialog()
        }
        binding.tvBirthDay.setOnClickListener {
            showDatePickerDiaLog()
        }
        binding.tvMale.setOnClickListener {
            gender = 0

            binding.tvMale.setTextColor(Color.WHITE)
            binding.tvFemale.setTextColor(Color.BLACK)
            binding.tvMale.setBackgroundResource(R.drawable.border_select)
            binding.tvFemale.setBackgroundResource(R.drawable.border_edit)
        }
        binding.tvFemale.setOnClickListener {
            binding.tvMale.setTextColor(Color.BLACK)
            binding.tvFemale.setTextColor(Color.WHITE)
            gender = 1
            binding.tvFemale.setBackgroundResource(R.drawable.border_select)
            binding.tvMale.setBackgroundResource(R.drawable.border_edit)
        }

        binding.btnNext.setOnClickListener {
            val currentDrawableResId: Int? = binding.civAvatar.drawable as? Int
            if (binding.etNickName.text.isEmpty()){
                binding.etNickName.setError("Không được để trống nick name")
            }
            else if (!isPickImage){
                Toast.makeText(this,"Vui lòng chọn hình cho bé !",Toast.LENGTH_SHORT).show()
            }
            else{
                sharedManager.saveImageId(binding.civAvatar.getTag() as Int)
                sharedManager.saveNickname(binding.etNickName.text.toString())
                sharedManager.saveGender(0)
                sharedManager.saveBirthDate(binding.tvBirthDay.text.toString())
                sharedManager.saveFirstLaunch(false)

                val intent = Intent(this,ActivityMainPage::class.java)
                startActivity(intent)
                finish()


            }
        }


    }

    private fun showDatePickerDiaLog() {
        // Get the current date for the DatePickerDialog
        val currentDate = Calendar.getInstance()
        val year = currentDate.get(Calendar.YEAR)
        val month = currentDate.get(Calendar.MONTH)
        val day = currentDate.get(Calendar.DAY_OF_MONTH)

        // Create the DatePickerDialog
        val datePickerDialog = DatePickerDialog(this,R.style.DatePickerStyle, this, year, month, day)
        datePickerDialog.show()
    }

    private fun showAvatarDialog() {
        val avatarDialog:DialogAvatar = DialogAvatar()
        avatarDialog.setCustomDialogListener(this)
        avatarDialog.show(supportFragmentManager,"Select Avatar")
    }

    override fun onDialogNextButtonClicked(idImage: Int) {
        binding.civAvatar.setImageResource(idImage)
        binding.civAvatar.setTag(idImage)
        isPickImage = true
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {

        val selectedDate = Calendar.getInstance()
        selectedDate.set(year, month, dayOfMonth)
        val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        val formattedDate = simpleDateFormat.format(selectedDate.time)

        binding.tvBirthDay.text = formattedDate
    }
}