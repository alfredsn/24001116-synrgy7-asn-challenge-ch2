package com.challenge.tiphublaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.google.android.material.switchmaterial.SwitchMaterial
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.google.android.material.textview.MaterialTextView

class MainActivity : AppCompatActivity() {

    private lateinit var etBillTotal : TextInputEditText
    private lateinit var cgTip: ChipGroup
    private lateinit var chip10: Chip
    private lateinit var chip15: Chip
    private lateinit var chip25: Chip
    private lateinit var chip35: Chip
    private lateinit var chip50: Chip
    private lateinit var switchRoundUpTip: SwitchMaterial
    private lateinit var btnCalculate: MaterialButton
    private lateinit var tilCostSummary: TextInputLayout
    private lateinit var tvBaseCost : MaterialTextView
    private lateinit var tvTipCost : MaterialTextView
    private lateinit var tvTotalCost : MaterialTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*etBillTotal = findViewById(R.id.et_first)
        cgTip = findViewById(R.id.cg_tip)
        chip10 = findViewById(R.id.chip_10)
        chip15 = findViewById(R.id.chip_15)
        chip25 = findViewById(R.id.chip_25)
        chip35 = findViewById(R.id.chip_35)
        chip50 = findViewById(R.id.chip_50)
        switchRoundUpTip = findViewById(R.id.sm_round_up_tip)
        btnCalculate = findViewById(R.id.btn_calculate)
        tilCostSummary = findViewById(R.id.til_summary_two)
        tvBaseCost = findViewById(R.id.tv_base_cost)
        tvTipCost = findViewById(R.id.tv_tip_cost)
        tvTotalCost = findViewById(R.id.tv_total_cost)*/

    }
}