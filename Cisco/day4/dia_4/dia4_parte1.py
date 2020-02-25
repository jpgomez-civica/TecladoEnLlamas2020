import hashlib
import re 

number = 0
input  = 'bgvyzdsv'


while not re.match("0{5}",hashlib.md5((input +str(number)).encode()).hexdigest()):
    number += 1

print ("RESULT 1:", number)
