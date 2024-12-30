def prime(n):
   f_count=0
for i in range(1,n+1):
    if(n%i==0):
        f_count=f_count+1
        print("Factors count  =",f_count)
        if(f_count==2):
            return True
        else:
            return False
n=int(input('enter any number:'))
prime(n)

