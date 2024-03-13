import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSubmit: Button = findViewById(R.id.buttonSubmit)
        buttonSubmit.setOnClickListener {
            sendData()
        }
    }

    private fun sendData() {
        val name = findViewById<EditText>(R.id.editTextName).text.toString()
        val email = findViewById<EditText>(R.id.editTextEmail).text.toString()
        val gender = findViewById<Spinner>(R.id.spinnerGender).selectedItem.toString()
        val datePicker = findViewById<DatePicker>(R.id.datePicker)
        val dob = formatDate(datePicker)

        val intent = Intent(this, DisplayDataActivity::class.java)
        intent.putExtra("NAME", name)
        intent.putExtra("EMAIL", email)
        intent.putExtra("GENDER", gender)
        intent.putExtra("DOB", dob)
        startActivity(intent)
    }

    private fun formatDate(datePicker: DatePicker): String {
        val day = datePicker.dayOfMonth
        val month = datePicker.month
        val year = datePicker.year

        val calendar = Calendar.getInstance()
        calendar.set(year, month, day)

        val dateFormat = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())
        return dateFormat.format(calendar.time)
    }
}