package com.njerireen.enwalletassesment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.njerireen.enwalletassesment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvExpenses.layoutManager = LinearLayoutManager(this)
        displayExpense()
    }

    fun displayExpense(){
        val expense1 = Wallet("Salary", "KES 40000", "1 July 2024", "Rent","16000", "2 July 2024")
        val expense2 = Wallet("Dividends", "KES 2400", "4 July 2024", "Rent","16000", "5 July 2024")
        val expense3 = Wallet("Internet", "KES 2500", "5 July 2024", "Electricity","800", "5 July 2024")
        val expense4 = Wallet("Bus Fare", "KES 500", "11 July 2024", "Shopping","3500", "12 July 2024")
        val expense5 = Wallet("Dividends", "KES 2400", "4 July 2024", "Rent","16000", "5 July 2024")
        val expense6 = Wallet("Internet", "KES 2500", "5 July 2024", "Electricity","800", "5 July 2024")
        val expense7 = Wallet("Bus Fare", "KES 500", "11 July 2024", "Shopping","3500", "12 July 2024")
        val expense8 = Wallet("Dividends", "KES 2400", "4 July 2024", "Rent","16000", "5 July 2024")
        val expense9 = Wallet("Salary", "KES 40000", "1 July 2024", "Rent","16000", "2 July 2024")

        val expenseList = listOf(expense1,expense2,expense3,expense4, expense5, expense6, expense7, expense8, expense9 )
        val expenseAdapter = WalletAdapter(expenseList)
        binding.rvExpenses.adapter = expenseAdapter
    }
}