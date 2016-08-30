การบ้านนี้ให้นักศึกษา implement “Dynamic Array ADT” โดยใช้ Java โดยให้มีคุณสมบัติดังต่อไปนี้
#1. ให้สร้าง class ชื่อว่า DynamicArray โดย class นี้ มี private variables ดังต่อไปนี้

 1. private int[] arr;
 2. private int capacity;
 3. private int size;
 4. ความหมายของแต่ละตัวแปรอยู่ในสไลด์ที่อาจารย์สอนในห้อง
#2. ให้ class DynamicArray มี public functions ดังต่อไปนี้
####a. public boolean isEmpty()
- ฟังก์ชันนี้ทำหน้าที่ return ว่า Data structure นี้ว่างหรือไม่
####b. public void pushBack(int data)
 - ฟังก์ชันนี้ท าหน้าที่น าข้อมูลใหม่มาต่อท้ายข้อมูลเดิม
 - ถ้า array ปัจจุบันเต็มให้ขยายขนาดออกเป็นสองเท่า ตามที่เรียนในห้อง
#### c. public int popBack()
 - ฟังก์ชันนี้ท าหน้าที่ลบข้อมูลที่อยู่ด้านหลังสุดออกไป
 - ให้ return ค่าของข้อมูลที่ถูกลบไป ส่งให้กับ caller ด้วย
 - ถ้า Data structure ว่างอยู่ ให้ print ออกทาง console ว่า ERROR แล้ว return 0 แทน
(meaningless number)
####d. public int get(int i)
 - ฟังก์ชันนี้ท าหน้าที่ return ค่าข้อมูลที่ถูก indexed ด้วยค่า i (ข้อมูลตัวแรกถูก indexed ด้วย 0)
 - ถ้าค่า i ไม่ถูกต้อง (คุณควรรู้ว่าค่า i ไม่ถูกต้องในกรณีใด) ให้ print ออกทาง console ว่า ERROR
แล้ว return 0 แทน (meaningless number)
####e. public void set(int i, int value)
 - ฟังก์ชันนี้ท าหน้าที่ set ค่า value ไปยังต าแหน่งใน array ที่ indexed ด้วยค่า i (ข้อมูลตัวแรกถูก
indexed ด้วย 0)
 - ถ้าค่า i ไม่ถูกต้อง (คุณควรรู้ว่าค่า i ไม่ถูกต้องในกรณีใด) ให้ print ออกทาง console ว่า ERROR
####f. public void remove(int i)
 - ฟังก์ชันนี้ท าหน้าที่ลบข้อมูลที่ถูก indexed ด้วยค่า i (ข้อมูลตัวแรกถูก indexed ด้วย 0)
 - เมื่อลบแล้วให้ท าการขยับซ้ายข้อมูลหลังจากนั้นจนถึงตัวสุดท้าย ตามที่เรียนในห้อง
 - ถ้าค่า i ไม่ถูกต้อง (คุณควรรู้ว่าค่า i ไม่ถูกต้องในกรณีใด) ให้ print ออกทาง console ว่า ERROR
####g. public int getSize()
 - ให้ return จ านวนข้อมูลที่ถูกบรรจุใน Data Structure
####h. public void printStructure()
 - ให้ print สถานะข้อมูลของ Data structure ออกทาง console ด้วย pattern ดังต่อไปนี้
 - หากมีข้อมูลคือ [ 3, 5, 6, 7 ] และ Cap = 4 ให้แสดงว่า
 - Size = 4, Cap = 4, arr = [ 3, 5, 6, 7 ]
 - หากมีข้อมูลคือ [ 1, 2] และ Cap = 4 ให้แสดงว่า
 - Size = 2, Cap = 4, arr = [ 1, 2 ]
