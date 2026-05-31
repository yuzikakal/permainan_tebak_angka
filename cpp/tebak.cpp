#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main() {
    srand(time(0)); 
    int random = rand() % 101;
    int tebakan;
    int salah = 0;

    cout << "----------Permainan Tebak Angka----------" << endl;
    cout << "Tebaklah sebuah angka antara 0 hingga 100" << endl;

    while (true) {
        cout << "Masukkan tebakan Anda: ";
        cin >> tebakan;

        if (tebakan < 0 || tebakan > 100) {
            cout << "Tebakan diluar dari angka yang ditentukan. Silahkan coba lagi." << endl;
            continue;
        }

        if (tebakan > random) {
            cout << "Tebakan  Anda terlalu tinggi. Coba lagi." << endl;
            salah++;
            continue;
        } else if (tebakan < random) {
            cout << "Tebakan Anda terlalu rendah. Coba lagi." << endl;
            salah++;
            continue;
        } else if (tebakan == random) {
            cout << endl;
            cout << "--------------------------SELAMAT--------------------------" << endl;
            cout << "Anda berhasil menebak angka yang benar setelah " << salah << " percobaan" << endl;
            if (salah > 10) {
                cout << "Skill issue lu awokwkwk" << endl;
                cout << endl;
            } else {
                cout << endl;
            }
        }
        break;
    }

    return 0;
}