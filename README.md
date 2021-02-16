<h1 align="center">SolarBinding</h1></br>

<p align="center">
A SolarBinding with databinding for andorid
</p>

<p align="center">
  <a href="https://opensource.org/licenses/Apache-2.0"><img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>
</p>

### Dependency Gradle 
Add below codes to your **root** `build.gradle` file (not your module build.gradle file).
```gradle(project)
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```

And add a dependency code to your **module**'s `build.gradle` file.
```gradle(app)
plugins {
  id 'kotlin-kapt'
}

buildFeatures {
  dataBinding true
}
```

```gradle
dependencies {
  implementation 'com.github.KennethSS:SolarBinding:1.0.2'
}
```


## Usage
### Basic Example

#### Prepare to making binding xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<layout ...>

    <androidx.constraintlayout.widget.ConstraintLayout>
      ...  
    </androidx.constraintlayout.widget.ConstraintLayout>
</layout>
```

#### Activity
```kotlin
class MainActivity : BindingActivity() {

    private val binding by binding<ActivityMainBinding>(R.layout.activity_main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        with(binding) {
            centerTv.text = "Hello World!"
        }
    }
}
```

#### Fragment
```kotlin
class SampleFragment : BindingFragment<FragmentSampleBinding>(){
    override val layoutRes: Int = R.layout.fragment_sample

    override fun onViewCreated(bind: FragmentSampleBinding, savedInstanceState: Bundle?) {
        bind.sampleTv.text = "Hello World!"
    }
}
```
