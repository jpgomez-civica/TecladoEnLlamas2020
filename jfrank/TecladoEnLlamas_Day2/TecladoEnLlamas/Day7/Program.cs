using System;

namespace Day7
{
    class Program
    {
        static void Main(string[] args)
        {
            ushort x = 123; // 123->x
            ushort y = 456; // 456->y
            ushort d = (ushort) (x & y); // x AND y->d
            ushort e = (ushort) (x | y); // x OR y->e
            ushort f = (ushort) (x << 2); // x LSHIFT 2->f
            ushort g = (ushort) (y >> 2); // y RSHIFT 2 -> g
            ushort h = (ushort) ~x; // NOT x -> h
            ushort i = (ushort) ~y; // NOT y -> i

            Console.WriteLine($"d:{d}");
            Console.WriteLine($"e:{e}");
            Console.WriteLine($"f:{f}");
            Console.WriteLine($"g:{g}");
            Console.WriteLine($"h:{h}");
            Console.WriteLine($"i:{i}");
            Console.WriteLine($"x:{x}");
            Console.WriteLine($"y:{y}");

            int number = 42;
            Console.WriteLine("{0}<<1 = {1}", number, number << 1);
            Console.WriteLine("{0}<<2 = {1}", number, number << 2);
            Console.WriteLine("{0}<<4 = {1}", number, number << 4);


        }
    }
}
