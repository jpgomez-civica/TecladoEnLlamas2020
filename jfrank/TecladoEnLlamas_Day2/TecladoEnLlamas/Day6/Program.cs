using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Security.Cryptography.X509Certificates;

namespace Day6
{
    public class Point
    {
        public int X { get; set; }
        public int Y { get; set; }

        public override string ToString()
        {
            return $"({X},{Y})";
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            ////initialize data exercise 1
            //Dictionary<string,bool> litCellsDictionary = new Dictionary<string, bool>();
            //for (int x = 0; x < 1000; x++)
            //{
            //    for (int y = 0; y < 1000; y++)
            //    {
            //        litCellsDictionary.Add($"{x},{y}",false);
            //    }
            //}

            var input = File.ReadLines("input.txt");
            //foreach (var inputItem in input)
            //{
            //    var gridActionParameters = inputItem.GetElectricActionParameters();
            //    for (int x = gridActionParameters.InitialPoint.X; x <= gridActionParameters.EndPoint.X; x++)
            //    {
            //        for (int y = gridActionParameters.InitialPoint.Y; y <= gridActionParameters.EndPoint.Y; y++)
            //        {
            //            switch (gridActionParameters.Action)
            //            {
            //                case LitAction.TurnOn:
            //                    litCellsDictionary[$"{x},{y}"] = true;
            //                    break;
            //                case LitAction.TurnOff:
            //                    litCellsDictionary[$"{x},{y}"] = false;
            //                    break;
            //                case LitAction.Toggle:
            //                    bool value = litCellsDictionary[$"{x},{y}"];
            //                    litCellsDictionary[$"{x},{y}"] = !value;
            //                    break;
            //            }
            //        }
            //    }
            //}

            //var litLight = litCellsDictionary.Values.Count(x => x);
            //var litOff = litCellsDictionary.Values.Count(x => !x);
            //Console.WriteLine($"Lit light count: {litLight}. Lit off count: {litOff}");


            //initialize data exercise 2
            //List<string> input = new List<string>()
            //{
            //    "toggle 0,0 through 999,999"
            //};
            Dictionary<string, int> litCellsBrightnessDictionary = new Dictionary<string, int>();
            for (int x = 0; x < 1000; x++)
            {
                for (int y = 0; y < 1000; y++)
                {
                    litCellsBrightnessDictionary.Add($"{x},{y}", 0);
                }
            }

            foreach (var inputItem in input)
            {
                var gridActionParameters = inputItem.GetElectricActionParameters();
                for (int x = gridActionParameters.InitialPoint.X; x <= gridActionParameters.EndPoint.X; x++)
                {
                    for (int y = gridActionParameters.InitialPoint.Y; y <= gridActionParameters.EndPoint.Y; y++)
                    {
                        int value = litCellsBrightnessDictionary[$"{x},{y}"];
                        switch (gridActionParameters.Action)
                        {
                            case LitAction.TurnOn:
                                litCellsBrightnessDictionary[$"{x},{y}"] = value + 1;
                                break;
                            case LitAction.TurnOff:
                                if (value > 0)
                                {
                                    litCellsBrightnessDictionary[$"{x},{y}"] = value - 1;
                                }
                                break;
                            case LitAction.Toggle:
                                litCellsBrightnessDictionary[$"{x},{y}"] = value + 2;
                                break;
                        }
                    }
                }
            }

            var litLightBrightness = litCellsBrightnessDictionary.Values.Sum();
            Console.WriteLine($"Total brightness {litLightBrightness}");


            Console.WriteLine("Hello World!");
        }
    }
}
