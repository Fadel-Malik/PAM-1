import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_data)

        val name = intent.getStringExtra("NAME")
        val email = intent.getStringExtra("EMAIL")
        val gender = intent.getStringExtra("GENDER")
        val dob = intent.getStringExtra("DOB")

        val textViewName: TextView = findViewById(R.id.textViewName)
        val textViewEmail: TextView = findViewById(R.id.textViewEmail)
        val textViewGender: TextView = findViewById(R.id.textViewGender)
        val textViewDOB: TextView = findViewById(R.id.textViewDOB)

        textViewName.text = "Name: $name"
        textViewEmail.text = "Email: $email"
        textViewGender.text = "Gender: $gender"
        textViewDOB.text = "Date of Birth: $dob"
    }
}