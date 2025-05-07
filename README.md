# Automation Web UI Testing Framework

## Tujuan Project

Repositori ini dibuat untuk menerapkan kerangka kerja pengujian UI Web otomatis menggunakan **Java**, **Selenium WebDriver**, **Cucumber (Gherkin)**, dan **Gradle**. Framework ini mengikuti pendekatan **Page Object Model (POM)**


## Teknologi yang Digunakan

- **Java 21**
- **Gradle** – sebagai build tool
- **Selenium WebDriver** – untuk interaksi dengan browser
- **Cucumber (Gherkin)** – untuk menulis test case yang mudah dibaca
- **JUnit** – untuk integrasi test runner

## Penyiapan & Konfigurasi

1. **Pastikan software berikut telah terinstal:**
   - Java JDK 17 atau lebih tinggi (digunakan Java 21)
   - Gradle (atau gunakan wrapper `./gradlew`)
   - Chrome browser (disesuaikan dengan ChromeDriver)

2. **Clone repository:**
   ```bash
   git clone https://github.com/RdwTS/AutomationWebUIFramework.git
   cd AutomationWebUIFramework

3. **Jalankan pengujian dengan Gradle:
  ./gradlew clean test**
  
4. **Jalankan pengujian cucumber Tags:
  ./gradlew cucumber -Ptags="" atau  gradle cucumber -Ptags=""**

5. **Jalankan pengujian cucumber
   run file CucumberTest**
