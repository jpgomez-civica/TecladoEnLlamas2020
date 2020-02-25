using System;
using System.Collections.Generic;
using System.IO;

namespace Day3
{
    class Program
    {
        static void Main(string[] args)
        {
            var input = File.ReadAllText("input.txt");
            Dictionary<string,int> map = new Dictionary<string, int>();

            //part 1
            //Point pSanta = new Point();
            //RegisterMove(map,pSanta);
            //foreach (var move in input)
            //{
            //    pSanta.ApplyMovement(move);
            //    RegisterMove(map, pSanta);
            //}


            //part2
            Point santa = new Point();
            Point robotSanta = new Point();
            RegisterMove(map,santa);
            RegisterMove(map, robotSanta);
            for (int i = 0; i < input.Length; i++)
            {
                if (i % 2 == 0)
                {
                    santa.ApplyMovement(input[i]);
                    RegisterMove(map, santa);
                }
                else
                {
                    robotSanta.ApplyMovement(input[i]);
                    RegisterMove(map, robotSanta);
                }
            }
            
            
            

            Console.WriteLine($"Visited houses: {map.Keys.Count}");


            
            
            
            Console.WriteLine("Hello World!");
        }

        static void RegisterMove(Dictionary<string, int> map, Point p)
        {
            if (map.ContainsKey(p.ToString()))
            {
                map[p.ToString()]++;
            }
            else
            {
                map.Add(p.ToString(),1);
            }
        }
    }
}
