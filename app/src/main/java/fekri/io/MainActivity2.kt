package fekri.io

import android.graphics.drawable.shapes.Shape
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import fekri.io.databinding.ActivityMain2Binding
import soup.neumorphism.ShapeType

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.neumorphImageView1.setOnClickListener {
            /* set shape type when clicked on it */
            binding.neumorphImageView1.setShapeType(ShapeType.PRESSED)
            /* give color to the icon when clicked on it */
            binding.neumorphImageView1.setColorFilter(
                ContextCompat.getColor(this, R.color.blue_light),
                android.graphics.PorterDuff.Mode.SRC_IN
            )

            binding.neumorphImageView2.setShapeType(ShapeType.FLAT)
            binding.neumorphImageView3.setShapeType(ShapeType.FLAT)
            binding.neumorphImageView4.setShapeType(ShapeType.FLAT)
        }

        binding.neumorphImageView2.setOnClickListener {

            binding.neumorphImageView2.setShapeType(ShapeType.PRESSED)

            binding.neumorphImageView2.setColorFilter(
                ContextCompat.getColor(this, R.color.blue_light),
                android.graphics.PorterDuff.Mode.SRC_IN
            )

            binding.neumorphImageView1.setShapeType(ShapeType.FLAT)
            binding.neumorphImageView3.setShapeType(ShapeType.FLAT)
            binding.neumorphImageView4.setShapeType(ShapeType.FLAT)
        }

        binding.neumorphImageView3.setOnClickListener {

            binding.neumorphImageView3.setShapeType(ShapeType.PRESSED)

            binding.neumorphImageView3.setColorFilter(
                ContextCompat.getColor(this, R.color.blue_light),
                android.graphics.PorterDuff.Mode.SRC_IN
            )

            binding.neumorphImageView1.setShapeType(ShapeType.FLAT)
            binding.neumorphImageView2.setShapeType(ShapeType.FLAT)
            binding.neumorphImageView4.setShapeType(ShapeType.FLAT)

        }

        binding.neumorphImageView4.setOnClickListener {

            binding.neumorphImageView4.setShapeType(ShapeType.PRESSED)

            binding.neumorphImageView4.setColorFilter(
                ContextCompat.getColor(this, R.color.blue_light),
                android.graphics.PorterDuff.Mode.SRC_IN
            )

            binding.neumorphImageView1.setShapeType(ShapeType.FLAT)
            binding.neumorphImageView2.setShapeType(ShapeType.FLAT)
            binding.neumorphImageView3.setShapeType(ShapeType.FLAT)

        }

    }
}