using System;
using System.Collections.Generic;
using System.IO;

namespace Day7
{
    class Program
    {
        static void Main(string[] args)
        {
            #region test
            //ushort x = 123; // 123->x
            //ushort y = 456; // 456->y
            //ushort d = (ushort) (x & y); // x AND y->d
            //ushort e = (ushort) (x | y); // x OR y->e
            //ushort f = (ushort) (x << 2); // x LSHIFT 2->f
            //ushort g = (ushort) (y >> 2); // y RSHIFT 2 -> g
            //ushort h = (ushort) ~x; // NOT x -> h
            //ushort i = (ushort) ~y; // NOT y -> i

            //Console.WriteLine($"d:{d}");
            //Console.WriteLine($"e:{e}");
            //Console.WriteLine($"f:{f}");
            //Console.WriteLine($"g:{g}");
            //Console.WriteLine($"h:{h}");
            //Console.WriteLine($"i:{i}");
            //Console.WriteLine($"x:{x}");
            //Console.WriteLine($"y:{y}"); 
            #endregion

            var input = File.ReadLines("input.txt");
            
            
            Dictionary<string, LineOperation> wireDictionary = new Dictionary<string, LineOperation>();
            foreach (var item in input)
            {
                var itemParts = item.Split(new char[] {' '});
                 
                switch (itemParts.Length)
                {
                    case 3:
                        //123 -> x
                        var loperation3 = new LineOperation(){Type = OperationType.Assignment};
                        string param30 = itemParts[0];
                        string param32 = itemParts[2];
                        if (ushort.TryParse(param30, out var value30))
                        {
                            loperation3.Signal1 = value30;
                        }
                        else
                        {
                            loperation3.Wire1 = param30;
                        }
                        wireDictionary.Add(param32, loperation3);
                        break;
                    case 4:
                        //NOT x -> h
                        var loperation4 = new LineOperation(){Type = OperationType.Single};
                        string param40 = itemParts[0];
                        string param41 = itemParts[1];
                        string param43 = itemParts[3];
                        loperation4.Wire1 = param41;
                        loperation4.Operation = param40.ToBitwiseOperation();
                        wireDictionary.Add(param43, loperation4);
                        break;
                    case 5:
                        //x AND y -> d
                        LineOperation loperation5 = new LineOperation(){Type = OperationType.Binary};
                        string param50 = itemParts[0];
                        string param51 = itemParts[1];
                        string param52 = itemParts[2];
                        string param54 = itemParts[4];
                        loperation5.Operation = param51.ToBitwiseOperation();
                        if (ushort.TryParse(param50, out var value51))
                        {
                            loperation5.Signal1 = value51;
                        }
                        else
                        {
                            loperation5.Wire1 = param50;
                        }

                        if (ushort.TryParse(param52, out var value52))
                        {
                            loperation5.Signal2 = value52;
                        }
                        else
                        {
                            loperation5.Wire2 = param52;
                        }

                        wireDictionary.Add(param54, loperation5);

                        break;
                }
                #region inspect
                //if (inspectInput.ContainsKey(separators))
                //{
                //    var valuesList = inspectInput[separators];
                //    valuesList.Add(item);
                //}
                //else
                //{
                //    List<string> list = new List<string>(){item};
                //    inspectInput.Add(separators,list);
                //} 
                #endregion
            }

            //TODO refactoring and reset dictionary?
            wireDictionary["b"].Signal1 = 16076;
            Console.WriteLine($"a: {Resolve("a", wireDictionary)}");


            Console.ReadKey();
        }

        public enum OperationType
        {
            Assignment,
            Single,
            Binary,
        }

        public class LineOperation
        {
            public OperationType Type { get; set; }
            public string Wire1 { get; set; }
            public string Wire2 { get; set; }

            public BitwiseOperation Operation { get; set; }
            
            public ushort? Signal1 { get; set; }
            public ushort? Signal2 { get; set; }

            public ushort? Result { get; set; }
        }

        public static ushort Resolve(string wire, Dictionary<string, LineOperation> inspectInput)
        {
            var operation = inspectInput[wire];
            ushort value1, value2;
            if (operation.Signal1.HasValue)
            {
                value1 = (ushort) operation.Signal1;
                Console.WriteLine($"{wire}: {value1}");
            }
            else
            {
                Console.WriteLine($"Look for {operation.Wire1}");
                value1 = Resolve(operation.Wire1, inspectInput);
                inspectInput[wire].Signal1 = value1;
            }

            if (operation.Type == OperationType.Assignment)
            {
                return value1;
            }

            if (operation.Type == OperationType.Single)
            {
                return (ushort)~value1;
            }

            if (operation.Signal2.HasValue)
            {
                value2 = (ushort) operation.Signal2;
                Console.WriteLine($"{wire}: {value1}");
            }
            else
            {
                Console.WriteLine($"Look for {operation.Wire2}");
                value2 = Resolve(operation.Wire2, inspectInput);
                inspectInput[wire].Signal2 = value2;
            }

            if (operation.Operation == BitwiseOperation.And)
            {
                return (ushort) (value1 & value2);
            }
            else if (operation.Operation == BitwiseOperation.Or)
            {
                return (ushort) (value1 | value2);
            }
            else if (operation.Operation == BitwiseOperation.LShift)
            {
                return (ushort) (value1 << value2);
            }else if (operation.Operation == BitwiseOperation.RShift)
            {
                return (ushort)(value1 >> value2);
            }
            
            throw new Exception("Fatal Error");


        }

    }
}
