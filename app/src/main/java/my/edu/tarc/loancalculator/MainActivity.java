package my.edu.tarc.loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String MONTHLY_PAYMENT = "payment";
    public static final String LOAN_STATUS = "status";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateLoan(View view){

        Intent intent = new Intent(this,ResultActivity.class);

        //TODO: calculate monthly payment
        String status;
        double totalLoan,vehiclePrice,downPayment,interestRate,repayment,totalInterest;
        double monthlyPayment ;
        vehiclePrice = R.id.editTextCarPrice;
        downPayment = R.id.editTextDownPayment;
        interestRate = R.id.editTextInterestRate;
        repayment = R.id.editTextLoadPeriod;

        totalInterest = (vehiclePrice -downPayment)*interestRate*(repayment/12);
        totalLoan = (vehiclePrice-downPayment)+(totalInterest/100);
        monthlyPayment = totalLoan/repayment;
        if(monthlyPayment > 30/100 * R.id.editTextSalary);

        //putExtra(TAG,value)
        intent.putExtra(MONTHLY_PAYMENT,monthlyPayment);
        intent.putExtra(LOAN_STATUS,status);
        startActivity(intent);
    }
}
