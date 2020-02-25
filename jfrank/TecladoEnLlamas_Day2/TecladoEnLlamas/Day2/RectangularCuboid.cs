//  --------------------------------------------------------------------------------------------------------------------
// <copyright file="RectangularCuboid.cs" company="Cívica Software">
//             2020 Copyright (c) Cívica Software. All rights reserved.
// </copyright>
// --------------------------------------------------------------------------------------------------------------------

namespace Day2
{
    public class RectangularCuboid
    {
        private readonly int _height;
        private readonly int _length;
        private readonly int _width;

        public RectangularCuboid(int length, int width, int height)
        {
            _length = length;
            _width = width;
            _height = height;
        }

        public int AreaSide1 => _length * _width;
        public int AreaSide2 => _width * _height;
        public int AreaSide3 => _height * _length;

        public int Side1Perimeter => 2 * _length + 2 * _width;
        public int Side2Perimeter => 2 * _width + 2 * _height;
        public int Side3Perimeter => 2 * _height + 2 * _length;

        public virtual int Surface => 2 * (AreaSide1 + AreaSide2 + AreaSide3);

        public virtual int Volumen => _length * _width * _height;
    }
}