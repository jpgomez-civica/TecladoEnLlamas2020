//  --------------------------------------------------------------------------------------------------------------------
// <copyright file="SantaRegularCuboid.cs" company="Cívica Software">
//             2020 Copyright (c) Cívica Software. All rights reserved.
// </copyright>
// --------------------------------------------------------------------------------------------------------------------

using System.Collections.Generic;
using System.Linq;

namespace Day2
{
    public class SantaRegularCuboid : RectangularCuboid
    {
        public SantaRegularCuboid(int length, int width, int height) : base(length, width, height)
        {
        }

        public override int Surface => base.Surface + SmallestSideArea();

        public int Ribbon => SmallestPerimeter() + Volumen;

        private int SmallestSideArea()
        {
            var rectangularCuboidAreaSides = new List<int> {AreaSide1, AreaSide2, AreaSide3};
            return rectangularCuboidAreaSides.Min();
        }

        private int SmallestPerimeter()
        {
            var perimeters = new List<int> {Side1Perimeter, Side2Perimeter, Side3Perimeter};
            return perimeters.Min();
        }
    }
}