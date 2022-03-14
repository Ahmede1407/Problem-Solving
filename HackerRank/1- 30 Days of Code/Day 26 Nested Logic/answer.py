# Enter your code here. Read input from STDIN. Print output to STDOUT
return_day, return_month, return_year = [
    int(e) for e in input().strip().split(' ')]
due_day, due_month, due_year = [int(e) for e in input().strip().split(' ')]

if due_year > return_year:
    print(0)

elif return_year == due_year:

    # check month
    if due_month > return_month:
        print(0)

    elif due_month == return_month:

        # check day
        if due_day >= return_day:
            print(0)
        else:
            print(15 * (return_day - due_day))

    else:
        print(500 * (return_month - due_month))
else:
    print(10000)
