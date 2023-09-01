package com.example.calculatorapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.calculatorapp.ui.theme.CalculatorAppTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalComposeUiApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorAppTheme {







                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val viewModel = viewModel<CalculatorViewModel>()
                    val state = viewModel.state
                    val buttonSpacing = 8.dp
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.DarkGray)
                            .padding(16.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),
                            verticalArrangement = Arrangement.spacedBy(buttonSpacing),
                        ) {
                            Text(
                                text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                                textAlign = TextAlign.End,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 32.dp),
                                fontWeight = FontWeight.Light,
                                fontSize = 80.sp,
                                color = Color.White,
                                maxLines = 2
                            )
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                            ) {
                                CalculatorButton(
                                    symbol = "AC",
                                    color = LightGray,
                                    modifier = Modifier
                                        .aspectRatio(2f)
                                        .weight(2f)
                                ) {
                                    viewModel.onAction(CalculatorActions.Clear)
                                }
                                CalculatorButton(
                                    symbol = "Del",
                                    color = LightGray,
                                    modifier = Modifier
                                        .aspectRatio(1f)
                                        .weight(1f)
                                ) {
                                    viewModel.onAction(CalculatorActions.Delete)
                                }
                                CalculatorButton(
                                    symbol = "/",
                                    color = LightGray,
                                    modifier = Modifier
                                        .aspectRatio(1f)
                                        .weight(1f)
                                ) {
                                    viewModel.onAction(CalculatorActions.Operation(CalculatorOperation.Divide))
                                }
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                            ) {
                                CalculatorButton(
                                    symbol = "7",
                                    color = LightGray,
                                    modifier = Modifier
                                        .aspectRatio(1f)
                                        .weight(1f)
                                ) {
                                    viewModel.onAction(CalculatorActions.Number(7))
                                }
                                CalculatorButton(
                                    symbol = "8",
                                    color = LightGray,
                                    modifier = Modifier
                                        .aspectRatio(1f)
                                        .weight(1f)
                                ) {
                                    viewModel.onAction(CalculatorActions.Number(8))
                                }
                                CalculatorButton(
                                    symbol = "9",
                                    color = LightGray,
                                    modifier = Modifier
                                        .aspectRatio(1f)
                                        .weight(1f)
                                ) {
                                    viewModel.onAction(CalculatorActions.Number(9))
                                }
                                CalculatorButton(
                                    symbol = "x",
                                    color = LightGray,
                                    modifier = Modifier
                                        .aspectRatio(1f)
                                        .weight(1f)
                                ) {
                                    viewModel.onAction(CalculatorActions.Operation(CalculatorOperation.multiply))
                                }
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                            ) {
                                CalculatorButton(
                                    symbol = "4",
                                    color = LightGray,
                                    modifier = Modifier
                                        .aspectRatio(1f)
                                        .weight(1f)
                                ) {
                                    viewModel.onAction(CalculatorActions.Number(4))
                                }
                                CalculatorButton(
                                    symbol = "5",
                                    color = LightGray,
                                    modifier = Modifier
                                        .aspectRatio(1f)
                                        .weight(1f)
                                ) {
                                    viewModel.onAction(CalculatorActions.Number(5))
                                }
                                CalculatorButton(
                                    symbol = "6",
                                    color = LightGray,
                                    modifier = Modifier
                                        .aspectRatio(1f)
                                        .weight(1f)
                                ) {
                                    viewModel.onAction(CalculatorActions.Number(6))
                                }
                                CalculatorButton(
                                    symbol = "-",
                                    color = LightGray,
                                    modifier = Modifier
                                        .aspectRatio(1f)
                                        .weight(1f)
                                ) {
                                    viewModel.onAction(CalculatorActions.Operation(CalculatorOperation.subtract))
                                }
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                            ) {
                                CalculatorButton(
                                    symbol = "1",
                                    color = LightGray,
                                    modifier = Modifier
                                        .aspectRatio(1f)
                                        .weight(1f)
                                ) {
                                    viewModel.onAction(CalculatorActions.Number(1))
                                }
                                CalculatorButton(
                                    symbol = "2",
                                    color = LightGray,
                                    modifier = Modifier
                                        .aspectRatio(1f)
                                        .weight(1f)
                                ) {
                                    viewModel.onAction(CalculatorActions.Number(2))
                                }
                                CalculatorButton(
                                    symbol = "3",
                                    color = LightGray,
                                    modifier = Modifier
                                        .aspectRatio(1f)
                                        .weight(1f)
                                ) {
                                    viewModel.onAction(CalculatorActions.Number(3))
                                }
                                CalculatorButton(
                                    symbol = "+",
                                    color = LightGray,
                                    modifier = Modifier
                                        .aspectRatio(1f)
                                        .weight(1f)
                                ) {
                                    viewModel.onAction(CalculatorActions.Operation(CalculatorOperation.Add))
                                }
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                            ) {
                                CalculatorButton(
                                    symbol = "0",
                                    color = LightGray,
                                    modifier = Modifier
                                        .aspectRatio(2f)
                                        .weight(2f)
                                ) {
                                    viewModel.onAction(CalculatorActions.Number(0))
                                }
                                CalculatorButton(
                                    symbol = ".",
                                    color = LightGray,
                                    modifier = Modifier
                                        .aspectRatio(1f)
                                        .weight(1f)
                                ) {
                                    viewModel.onAction(CalculatorActions.Decimal)
                                }
                                CalculatorButton(
                                    symbol = "=",
                                    color = Color.LightGray,
                                    modifier = Modifier
                                        .aspectRatio(1f)
                                        .weight(1f)
                                ) {
                                    viewModel.onAction(CalculatorActions.Calculate)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}


 


