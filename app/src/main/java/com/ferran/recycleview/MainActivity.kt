package com.ferran.recycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getting the recyclerview by its id
        val recyclerview: RecyclerView = findViewById(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<BocataData>()

        data.add(BocataData(R.drawable.konig, "Hamburguesa König", "8,95 €", "Hamburguesa de vedella amb enciam, tomàquet i salsa de la casa."))
        data.add(BocataData(R.drawable.bbq, "Hamburguesa BBQ", "9,95 €", "Hamburguesa amb salsa barbacoa, formatge cheddar i ceba cruixent."))
        data.add(BocataData(R.drawable.cheese, "Hamburguesa Cheese", "8,50 €", "Hamburguesa amb formatge fos, enciam i tomàquet."))
        data.add(BocataData(R.drawable.bacon, "Hamburguesa Bacon", "9,50 €", "Hamburguesa amb bacó cruixent, formatge i salsa especial."))
        data.add(BocataData(R.drawable.crispy, "Hamburguesa Crispy", "8,95 €", "Pollastre arrebossat cruixent amb enciam i maionesa."))
        data.add(BocataData(R.drawable.doubleburger, "Hamburguesa Double", "11,95 €", "Doble hamburguesa de vedella amb formatge i salsa de la casa."))
        data.add(BocataData(R.drawable.veggie, "Hamburguesa Veggie", "9,25 €", "Hamburguesa vegetal amb enciam, tomàquet i salsa vegana."))
        data.add(BocataData(R.drawable.hotdog, "Hot Dog", "6,95 €", "Frankfurt amb mostassa, quètxup i ceba cruixent."))
        data.add(BocataData(R.drawable.chicken, "Chicken Burger", "8,75 €", "Entrepà de pollastre a la planxa amb enciam i salsa."))
        data.add(BocataData(R.drawable.full, "Hamburguesa Full", "10,50 €", "Hamburguesa amb formatge, bacó, ou, enciam i tomàquet."))

        // This will pass the ArrayList to our Adapter
        val adapter = Adapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
    }
}