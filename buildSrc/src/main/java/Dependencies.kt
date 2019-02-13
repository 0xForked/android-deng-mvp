
/**
 * Created by A. A. Sumitro on 2/13/2019
 * aasumitro@merahputih.id
 * https://aasumitro.id
 */

object ApplicationIds {
    val main = "id.bakode.mvp"
    val withJava = "id.bakode.mvp.java"
    val withKotlin = "id.bakode.mvp.kotlin"
}

object Releases {
    val version_code = 1
    val version_name = "1.0"
}

object SDK {
    var compile_version = 28
    var target_version = 28
    var minimum_version = 16
}

object Version {
    internal var gradle_version = "3.3.1"
    internal var kotlin_version = "1.3.21"
    internal var appcompat_version = "1.0.0-beta01"
    internal var constraintlayout_version = "1.1.2"
    internal var junit_version = "4.12"
    internal var test_runner_version = "1.1.0-alpha4"
    internal var espresso_core_version = "3.1.0-alpha4"
}

object GradleDeps {
    var gradle_plugin = "com.android.tools.build:gradle:${Version.gradle_version}"
}

object KotlinDeps {
    var kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin_version}"
    var kotlin_std_lib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Version.kotlin_version}"
}

object AndroidXDeps {
    var appcompat = "androidx.appcompat:appcompat:${Version.appcompat_version}"
    var constraint_layout = "androidx.constraintlayout:constraintlayout:${Version.constraintlayout_version}"
    var test_runner = "androidx.test:runner:${Version.test_runner_version}"
    var espresso_core = "androidx.test.espresso:espresso-core:${Version.espresso_core_version}"
}

object TestDeps {
    var junit = "junit:junit:${Version.junit_version}"
}