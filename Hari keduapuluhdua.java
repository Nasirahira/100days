def total_tegangan(resistors):
    total = sum(resistors)
    return total

resistor_values = [100, 200, 300]  # Ganti dengan nilai-nilai resistor Anda sendiri
total_tegangan_hasil = total_tegangan(resistor_values)
print(f'Tegangan total dalam rangkaian adalah {total_tegangan_hasil} Volt')
